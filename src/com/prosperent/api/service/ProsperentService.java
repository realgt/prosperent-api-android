package com.prosperent.api.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;

import com.prosperent.api.ProsperentAPI.CallBack;

/***
 * Performs calls to prosperent webservices and parses JSON response
 * 
 */
public final class ProsperentService
{
	public static final String BASE_URL = "http://api.prosperent.com";

	public static final String PRODUCTS_ENDPOINT = "/api/search";

	private static ObjectMapper mapper = new ObjectMapper();

	private static enum ProsperentResponseType
	{
		PRODUCT, COUPON, MERCHANT;
	}

	// private String responseJSON;
	public void getProducts(String query, CallBack callback)
	{
		final String serviceUrl = BASE_URL + PRODUCTS_ENDPOINT + query;
		ServiceTask st = new ServiceTask(callback, ProsperentResponseType.PRODUCT);
		st.execute(serviceUrl);
	}

	private static String getServiceData(String serviceUrl)
	{
		String responseData = "";
		final AndroidHttpClient client = AndroidHttpClient.newInstance("Android");
		final HttpGet request = new HttpGet(serviceUrl);
		try
		{
			HttpResponse response = client.execute(request);
			final int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != HttpStatus.SC_OK)
			{
			}
			final HttpEntity entity = response.getEntity();
			if (entity != null)
			{
				InputStream inputStream = null;
				try
				{
					inputStream = entity.getContent();
					BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
					StringBuilder responseTotal = new StringBuilder();
					String line;
					while ((line = r.readLine()) != null)
					{
						responseTotal.append(line);
					}
					responseData = responseTotal.toString();
				}
				finally
				{
					if (inputStream != null)
					{
						inputStream.close();
					}
					entity.consumeContent();
				}
			}
		}
		catch (Exception e)
		{
			request.abort();
		}
		finally
		{
			if (client != null)
			{
				client.close();
			}
		}
		return responseData;
	}

	public class ServiceTask extends AsyncTask<String, Void, String>
	{
		private CallBack callback;

		private ProsperentResponseType responseType;

		public ServiceTask(CallBack callback, ProsperentResponseType responseType)
		{
			this.callback = callback;
			this.responseType = responseType;
		}

		protected String doInBackground(String... serviceUrl)
		{
			return ProsperentService.getServiceData(serviceUrl[0]);
		}

		protected void onPostExecute(String result)
		{
			if (isCancelled())
			{
				result = null;
			}
			try
			{
				switch (responseType)
				{
				case PRODUCT:
					callback.onComplete(mapper.readValue(result, ProsperentProductResponse.class));
					break;
				case COUPON:
					//TODO: add support for coupon API
					break;
				case MERCHANT:
					//TODO: add support for merchants API
					break;
				}
			}
			catch (JsonParseException e)
			{
				e.printStackTrace();
			}
			catch (JsonMappingException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
