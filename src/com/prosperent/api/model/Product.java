package com.prosperent.api.model;

import org.codehaus.jackson.annotate.JsonProperty;

/***
 * Product
 * 
 */
public class Product extends Data
{
	@JsonProperty("affiliate_url")
	private String affiliate_url;

	private String brand;

	private String catalogId;

	private String category;

	private String currency;

	private String description;

	@JsonProperty("image_url")
	private String image_url;

	private String isbn;

	private String keyword;

	private String merchant;

	private String price;

	@JsonProperty("price_sale")
	private String price_sale;

	private String productId;

	private Number sales;

	private Number groupCount;

	private String maxPrice;

	private String maxPriceSale;

	private String minPrice;

	private String minPriceSale;

	private String upc;

	public String getAffiliateUrl()
	{
		return this.affiliate_url;
	}

	public void setAffiliateUrl(String affiliate_url)
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

	public Number getGroupCount()
	{
		return this.groupCount;
	}

	public void setGroupCount(Number groupCount)
	{
		this.groupCount = groupCount;
	}

	public String getImageUrl()
	{
		return this.image_url;
	}

	public void setImageUrl(String image_url)
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

	public String getMaxPrice()
	{
		return this.maxPrice;
	}

	public void setMaxPrice(String maxPrice)
	{
		this.maxPrice = maxPrice;
	}

	public String getMaxPriceSale()
	{
		return this.maxPriceSale;
	}

	public void setMaxPriceSale(String maxPriceSale)
	{
		this.maxPriceSale = maxPriceSale;
	}

	public String getMerchant()
	{
		return this.merchant;
	}

	public void setMerchant(String merchant)
	{
		this.merchant = merchant;
	}

	public String getMinPrice()
	{
		return this.minPrice;
	}

	public void setMinPrice(String minPrice)
	{
		this.minPrice = minPrice;
	}

	public String getMinPriceSale()
	{
		return this.minPriceSale;
	}

	public void setMinPriceSale(String minPriceSale)
	{
		this.minPriceSale = minPriceSale;
	}

	public String getPrice()
	{
		return this.price;
	}

	public void setPrice(String price)
	{
		this.price = price;
	}

	public String getPriceSale()
	{
		return this.price_sale;
	}

	public void setPriceSale(String price_sale)
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