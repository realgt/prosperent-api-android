package com.prosperent.api.service;

import java.util.List;

import com.prosperent.api.model.Error;
import com.prosperent.api.model.Warnings;

public abstract class ProsperentResponse
{
	
	private String countryCode;

	private String coupons;

//	private List<Data> data;

	private List<Error> errors;

	private String extendedQuery;

	private String facets;

	private Number limit;

	private Number page;

	private Number totalRecords;

	private Number totalRecordsFound;

	private List<Warnings> warnings;

	public String getCountryCode()
	{
		return this.countryCode;
	}

	public void setCountryCode(String countryCode)
	{
		this.countryCode = countryCode;
	}

	public String getCoupons()
	{
		return this.coupons;
	}

	public void setCoupons(String coupons)
	{
		this.coupons = coupons;
	}

//	public List<Data> getData()
//	{
//		return this.data;
//	}
//
//	public void setData(List<Data> data)
//	{
//		this.data = data;
//	}

	public List<Error> getErrors()
	{
		return this.errors;
	}

	public void setErrors(List<Error> errors)
	{
		this.errors = errors;
	}

	public String getExtendedQuery()
	{
		return this.extendedQuery;
	}

	public void setExtendedQuery(String extendedQuery)
	{
		this.extendedQuery = extendedQuery;
	}

	public String getFacets()
	{
		return this.facets;
	}

	public void setFacets(String facets)
	{
		this.facets = facets;
	}

	public Number getLimit()
	{
		return this.limit;
	}

	public void setLimit(Number limit)
	{
		this.limit = limit;
	}

	public Number getPage()
	{
		return this.page;
	}

	public void setPage(Number page)
	{
		this.page = page;
	}

	public Number getTotalRecords()
	{
		return this.totalRecords;
	}

	public void setTotalRecords(Number totalRecords)
	{
		this.totalRecords = totalRecords;
	}

	public Number getTotalRecordsFound()
	{
		return this.totalRecordsFound;
	}

	public void setTotalRecordsFound(Number totalRecordsFound)
	{
		this.totalRecordsFound = totalRecordsFound;
	}

	public List<Warnings> getWarnings()
	{
		return this.warnings;
	}

	public void setWarnings(List<Warnings> warnings)
	{
		this.warnings = warnings;
	}
}
