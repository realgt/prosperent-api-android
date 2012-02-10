package com.prosperent.api.model;

/***
 * If the error array is empty then the request was successful. If the error
 * array is not empty it means that the API was unable to return the requested
 * data.
 * 
 */
public class Error
{
	private String code;

	private String msg;

	public String getCode()
	{
		return this.code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getMsg()
	{
		return this.msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}
}
