package com.prosperent.api;

import java.util.ArrayList;

import com.prosperent.api.model.Product;
import com.prosperent.api.service.ProsperentService;


/***
 * Main entry point to library. Provides methods to return data objects representing the Prosperent API
 *
 */
public class ProsperentAPI
{
	private String apiKey;

	public String getApiKey()
	{
		return apiKey;
	}

	public void setApiKey(String apiKey)
	{
		this.apiKey = apiKey;
	}
	/***
	 * Returns an Array of {@link com.prosperent.api.model.Product.java Product} objects
	 */	
	public static ArrayList<Product> getProducts()
	{
		ProsperentService service = new ProsperentService();
		String json = service.getProducts("http://api.prosperent.com/api/search?api_key=7173110a4004ea601e47311f1cf2b7ac&query=football&visitor_ip=127.0.0.1");
		
		return null;
	}
	
}
