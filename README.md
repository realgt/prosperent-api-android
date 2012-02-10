prosperent-api-android
========================

Provides a set of Java classes that represent the Prosperent API.  Performs network calls and parses response into objects.

Requires INTERNET permission in your AndroidManifest.xml

<uses-permission android:name="android.permission.INTERNET" />

For now only supports product API
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
(assuming you have saved your prosperent_api_key in strings

```java
	String apiKey = getString(R.string.prosperent_api_key);
	ProsperentRequest request = new ProsperentRequest();
	request.setQuery("race cars");
	
	ProsperentProductResponse response = ProsperentAPI.getProsperentProductResponse(apiKey, request);
	if (response != null)
	{
		for (Product product : response.getData())
		{
			String productDesc = product.getDescription();
			String thumbnailUrl = product.getImageThumbUrl();
			//do something with the data
		}
	}
```

TODO
=====
* implement callbacks to avoid UI thread wait!
* better logging
* implement caching
* merchant api
* coupon api
More documentation to follow