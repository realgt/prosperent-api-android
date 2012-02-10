package com.prosperent.api.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;

/***
 * Performs calls to prosperent webservices and parses JSON response
 * 
 */
public final class ProsperentService
{
	public static final String BASE_URL = "http://api.prosperent.com";

	public static final String PRODUCTS_ENDPOINT = "/api/search";
	
	private String responseJSON;
	
	public String getProducts(String query)
	{
		final String serviceUrl = BASE_URL + PRODUCTS_ENDPOINT + query;
		ServiceTask st = new ServiceTask();
		st.execute(serviceUrl);
		try
		{
			//TODO: rework this with a callback to avoid UI thread waiting
			responseJSON = st.get();
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ExecutionException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return responseJSON;
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
			responseJSON = result;
		}
	}
}
