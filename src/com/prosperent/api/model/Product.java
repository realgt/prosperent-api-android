package com.prosperent.api.model;

public class Product extends Data
{
	private String affiliate_url;

	private String brand;

	private String catalogId;

	private String category;

	private String currency;

	private String description;

	private String image_thumb_url;

	private String image_url;

	private String isbn;

	private String keyword;

	private String merchant;

	private String price;

	private String price_sale;

	private String productId;

	private Number sales;

	private String upc;

	public String getAffiliate_url()
	{
		return this.affiliate_url;
	}

	public void setAffiliate_url(String affiliate_url)
	{
		this.affiliate_url = affiliate_url;
	}

	public String getBrand()
	{
		return this.brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getCatalogId()
	{
		return this.catalogId;
	}

	public void setCatalogId(String catalogId)
	{
		this.catalogId = catalogId;
	}

	public String getCategory()
	{
		return this.category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public String getCurrency()
	{
		return this.currency;
	}

	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getImage_thumb_url()
	{
		return this.image_thumb_url;
	}

	public void setImage_thumb_url(String image_thumb_url)
	{
		this.image_thumb_url = image_thumb_url;
	}

	public String getImage_url()
	{
		return this.image_url;
	}

	public void setImage_url(String image_url)
	{
		this.image_url = image_url;
	}

	public String getIsbn()
	{
		return this.isbn;
	}

	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public String getKeyword()
	{
		return this.keyword;
	}

	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}

	public String getMerchant()
	{
		return this.merchant;
	}

	public void setMerchant(String merchant)
	{
		this.merchant = merchant;
	}

	public String getPrice()
	{
		return this.price;
	}

	public void setPrice(String price)
	{
		this.price = price;
	}

	public String getPrice_sale()
	{
		return this.price_sale;
	}

	public void setPrice_sale(String price_sale)
	{
		this.price_sale = price_sale;
	}

	public String getProductId()
	{
		return this.productId;
	}

	public void setProductId(String productId)
	{
		this.productId = productId;
	}

	public Number getSales()
	{
		return this.sales;
	}

	public void setSales(Number sales)
	{
		this.sales = sales;
	}

	public String getUpc()
	{
		return this.upc;
	}

	public void setUpc(String upc)
	{
		this.upc = upc;
	}
}