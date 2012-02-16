prosperent-api-android
========================

Provides a set of Java classes that represent the Prosperent API.  

Requires INTERNET permission in your AndroidManifest.xml

<uses-permission android:name="android.permission.INTERNET" />

For now only supports product API

### Features
* Performs network calls in AsyncTask and parses response into objects 
* Automatically sets Visitor IP to device IP address if not set manually
* UrlEncodes the query field

### Setup
Download the jar file from the Downloads section on GitHub
[Download Jar] (https://github.com/downloads/realgt/prosperent-api-android/prosperent-api-android.jar)

Requires Jackson JSON parsing library (jackson core and mapper)
[Jackson Download Link] (http://wiki.fasterxml.com/JacksonDownload)

Add Project dependencies to your Android project for those 3 jar files.

* prosperent-api-android.jar
* jackson-core-asl-1.9.4.jar
* jackson-mapper-asl-1.9.4.jar

### Example usage 
(assuming you have saved your prosperent_api_key in res/value/strings.xml)

```java
	String apiKey = getString(R.string.prosperent_api_key);
	ProsperentRequest request = new ProsperentRequest();
	request.setQuery("race cars");
	
	ProsperentAPI.getProsperentProductResponse(apiKey, request, new ProsperentAPI.CallBack()
	{
		@Override
		public void onComplete(ProsperentResponse response)
		{
			if (response != null)
			{
				for (Product product : response.getData())
				{
					String productDesc = product.getDescription();
					String thumbnailUrl = product.getImageThumbUrl();
					//do something with the data
				}
			}
		}
	}

```

TODO
=====
* better logging
* implement caching
* merchant api
* coupon api


More documentation to follow