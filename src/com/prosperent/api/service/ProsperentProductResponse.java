package com.prosperent.api.service;

import java.util.List;

import com.prosperent.api.model.Product;

public class ProsperentProductResponse extends ProsperentResponse
{
	private List<Product> data;
	
	public List<Product> getData()
	{
		return this.data;
	}

	public void setData(List<Product> data)
	{
		this.data = data;
	}
}
