package com.prosperent.api.service;

import java.net.URLEncoder;

public class ProsperentRequest
{
	private String query;
	private String filter;
	private String minPrice;
	private String maxPrice;
	private String sortPrice;
	private String minPriceSale;
	private String maxPriceSale;
	private String sortPriceSale;
	private String visitor_ip;
	private String userAgent;
	private String referrer;
	private String serpQuery;
	private String location;
	private String sid;
	private String debugMode;
	private String enableCoupons;
	private String enableFacets;
	private String enableQuerySuggestion;
	private String page;
	private String limits;
	private String extendedQuery;
	private String extendedSortMode;
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		if (query != null) sb.append("&query="+URLEncoder.encode(query));
		if (filter != null) sb.append("&filter="+filter);
		if (minPrice != null) sb.append("&minPrice="+minPrice);
		if (maxPrice != null) sb.append("&maxPrice="+maxPrice);
		if (sortPrice != null) sb.append("&sortPrice="+sortPrice);
		if (minPriceSale != null) sb.append("&minPriceSale="+minPriceSale);
		if (maxPriceSale != null) sb.append("&maxPriceSale="+maxPriceSale);
		if (sortPriceSale != null) sb.append("&sortPriceSale="+sortPriceSale);
		if (visitor_ip != null) sb.append("&visitor_ip="+visitor_ip);
		if (userAgent != null) sb.append("&userAgent="+userAgent);
		if (referrer != null) sb.append("&referrer="+referrer);
		if (serpQuery != null) sb.append("&serpQuery="+serpQuery);
		if (location != null) sb.append("&location="+location);
		if (sid != null) sb.append("&sid="+sid);
		if (debugMode != null) sb.append("&debugMode="+debugMode);
		if (enableCoupons != null) sb.append("&enableCoupons="+enableCoupons);
		if (enableFacets != null) sb.append("&enableFacets="+enableFacets);
		if (enableQuerySuggestion != null) sb.append("&enableQuerySuggestion="+enableQuerySuggestion);
		if (page != null) sb.append("&page="+page);
		if (limits != null) sb.append("&limits="+limits);
		if (extendedQuery != null) sb.append("&extendedQuery="+URLEncoder.encode(extendedQuery));
		if (extendedSortMode != null) sb.append("&extendedSortMode="+extendedSortMode);


		return sb.toString();
	}
	
	public String getQuery()
	{
		return query;
	}
	public void setQuery(String query)
	{
		this.query = query;
	}
	public String getFilter()
	{
		return filter;
	}
	public void setFilter(String filter)
	{
		this.filter = filter;
	}
	public String getMinPrice()
	{
		return minPrice;
	}
	public void setMinPrice(String minPrice)
	{
		this.minPrice = minPrice;
	}
	public String getMaxPrice()
	{
		return maxPrice;
	}
	public void setMaxPrice(String maxPrice)
	{
		this.maxPrice = maxPrice;
	}
	public String getSortPrice()
	{
		return sortPrice;
	}
	public void setSortPrice(String sortPrice)
	{
		this.sortPrice = sortPrice;
	}
	public String getMinPriceSale()
	{
		return minPriceSale;
	}
	public void setMinPriceSale(String minPriceSale)
	{
		this.minPriceSale = minPriceSale;
	}
	public String getMaxPriceSale()
	{
		return maxPriceSale;
	}
	public void setMaxPriceSale(String maxPriceSale)
	{
		this.maxPriceSale = maxPriceSale;
	}
	public String getSortPriceSale()
	{
		return sortPriceSale;
	}
	public void setSortPriceSale(String sortPriceSale)
	{
		this.sortPriceSale = sortPriceSale;
	}
	public String getVisitorIP()
	{
		return visitor_ip;
	}
	public void setVisitorIP(String visitor_ip)
	{
		this.visitor_ip = visitor_ip;
	}
	public String getUserAgent()
	{
		return userAgent;
	}
	public void setUserAgent(String userAgent)
	{
		this.userAgent = userAgent;
	}
	public String getReferrer()
	{
		return referrer;
	}
	public void setReferrer(String referrer)
	{
		this.referrer = referrer;
	}
	public String getSerpQuery()
	{
		return serpQuery;
	}
	public void setSerpQuery(String serpQuery)
	{
		this.serpQuery = serpQuery;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public String getSid()
	{
		return sid;
	}
	public void setSid(String sid)
	{
		this.sid = sid;
	}
	public String getDebugMode()
	{
		return debugMode;
	}
	public void setDebugMode(String debugMode)
	{
		this.debugMode = debugMode;
	}
	public String getEnableCoupons()
	{
		return enableCoupons;
	}
	public void setEnableCoupons(String enableCoupons)
	{
		this.enableCoupons = enableCoupons;
	}
	public String getEnableFacets()
	{
		return enableFacets;
	}
	public void setEnableFacets(String enableFacets)
	{
		this.enableFacets = enableFacets;
	}
	public String getEnableQuerySuggestion()
	{
		return enableQuerySuggestion;
	}
	public void setEnableQuerySuggestion(String enableQuerySuggestion)
	{
		this.enableQuerySuggestion = enableQuerySuggestion;
	}
	public String getPage()
	{
		return page;
	}
	public void setPage(String page)
	{
		this.page = page;
	}
	public String getLimits()
	{
		return limits;
	}
	public void setLimits(String limits)
	{
		this.limits = limits;
	}

	public String getExtendedQuery()
	{
		return extendedQuery;
	}

	public void setExtendedQuery(String extendedQuery)
	{
		this.extendedQuery = extendedQuery;
	}

	public String getExtendedSortMode()
	{
		return extendedSortMode;
	}

	public void setExtendedSortMode(String extendedSortMode)
	{
		this.extendedSortMode = extendedSortMode;
	}
	
}
