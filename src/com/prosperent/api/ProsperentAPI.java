package com.prosperent.api;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import android.util.Log;

import com.prosperent.api.model.Product;
import com.prosperent.api.service.ProsperentProductResponse;
import com.prosperent.api.service.ProsperentRequest;
import com.prosperent.api.service.ProsperentService;

/***
 * Provides a set of Java classes that represent the Prosperent API.  Performs network calls and parses response into objects.
 * Requires INTERNET permission in your AndroidManifest.xml
 * <uses-permission android:name="android.permission.INTERNET" />
 * 
 * Main entry point to library.
 */
public class ProsperentAPI
{
	private static final String TAG = null;

	private static ObjectMapper mapper = new ObjectMapper();

	/***
	 * Returns a {@link ProsperentProductResponse} with a list of
	 * {@link Product} objects in {@link ProsperentProductResponse#getData()
	 * getData()}
	 */
	public static ProsperentProductResponse getProsperentProductResponse(String apiKey, ProsperentRequest request)
	{
		if (isValidRequest(apiKey, request))
		{
			ProsperentService service = new ProsperentService();
			String json = service.getProducts(String.format("?api_key=%s%s", apiKey, request.toString()));
			try
			{
				return mapper.readValue(json, ProsperentProductResponse.class);
			}
			catch (JsonParseException e)
			{
				Log.e(TAG, e.toString());
			}
			catch (JsonMappingException e)
			{
				Log.e(TAG, e.toString());
			}
			catch (IOException e)
			{
				Log.e(TAG, e.toString());
			}
		}
		return null;
	}

	/***
	 * Performa validation of required fields, such as api_key, filter, or query
	 * 
	 * @param apiKey
	 * @param request
	 * @return
	 */
	private static boolean isValidRequest(String apiKey, ProsperentRequest request)
	{
		if (apiKey == null || apiKey == "") { return false; }
		if ((request.getQuery() == null || "".equals(request.getQuery()) 
				&& (request.getFilter() == null || "".equals(request.getFilter())))) 
		{ return false; }
		
		if (request.getVisitorIP() == null || "".equals(request.getVisitorIP()))
		{
			request.setVisitorIP(getLocalIpAddress());
		}
		
		return true;
	}

	public static String getLocalIpAddress()
	{
		try
		{
			for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();)
			{
				NetworkInterface intf = en.nextElement();
				for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();)
				{
					InetAddress inetAddress = enumIpAddr.nextElement();
					if (!inetAddress.isLoopbackAddress()) {
						return inetAddress.getHostAddress().toString(); 
					}
				}
			}
		}
		catch (SocketException ex)
		{
			Log.e(TAG, ex.toString());
		}
		return "127.0.0.1";
	}
}
