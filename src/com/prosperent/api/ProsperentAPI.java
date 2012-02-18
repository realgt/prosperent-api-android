package com.prosperent.api;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import org.codehaus.jackson.util.ByteArrayBuilder;

import android.util.Log;

import com.prosperent.api.model.Product;
import com.prosperent.api.service.ProsperentProductResponse;
import com.prosperent.api.service.ProsperentRequest;
import com.prosperent.api.service.ProsperentResponse;
import com.prosperent.api.service.ProsperentService;

/***
 * Provides a set of Java classes that represent the Prosperent API. Performs network calls and parses response into objects. Requires INTERNET permission in
 * your AndroidManifest.xml <uses-permission android:name="android.permission.INTERNET" />
 * 
 * Main entry point to library.
 */
public class ProsperentAPI
{
	private static final String TAG = null;

	// private static ObjectMapper mapper = new ObjectMapper();
	/**
	 * Interface definition for a callback to be invoked when a view is clicked.
	 */
	public interface CallBack
	{
		/**
		 * Called when a response has been received from Prosperent.
		 * 
		 * @param response
		 *            The ProsperentResponse that was received.
		 */
		void onComplete(ProsperentResponse response);
	}

	/***
	 * Returns a {@link ProsperentProductResponse} with a list of {@link Product} objects in {@link ProsperentProductResponse#getData() getData()}
	 */
	public static void getProsperentProductResponse(String apiKey, ProsperentRequest request, CallBack callBack)
	{
		if (isValidRequest(apiKey, request))
		{
			ProsperentService service = new ProsperentService();
			service.getProducts(String.format("?api_key=%s%s", apiKey, request.toString()), callBack);
		}
	}

	/***
	 * Performa validation of required fields, such as api_key, filter, or query
	 * 
	 * @param apiKey
	 * @param request
	 * @return true if request is valid, false otherwise
	 */
	private static boolean isValidRequest(String apiKey, ProsperentRequest request)
	{
		if (apiKey == null || apiKey == "") { return false; }
		if ((request.getQuery() == null || "".equals(request.getQuery())) && (request.getExtendedQuery() == null || "".equals(request.getExtendedQuery())) && (request.getFilter() == null || "".equals(request.getFilter()))) { return false; }
		if (request.getVisitorIP() == null || "".equals(request.getVisitorIP()))
		{
			request.setVisitorIP(getLocalIpAddress());
		}
		return true;
	}

	/***
	 * Loops over enumerated {@link NetworkInterface NetworkInterfaces} and identifies non loopback address
	 * 
	 * @return {@link InetAddress#getHostAddress().toString()} or defaults to "127.0.0.1"
	 */
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
					if (!inetAddress.isLoopbackAddress())
					{
						if (inetAddress instanceof Inet4Address)
						{
							return inetAddress.getHostAddress().toString();
						}
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
