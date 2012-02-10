!prosperent-api-android


Provides a set of Java classes that represent the Prosperent API.  Performs network calls and parses response into objects.

Requires INTERNET permission in your AndroidManifest.xml

<uses-permission android:name="android.permission.INTERNET" />

For now only supports product API


!!Example usage

```java
		ProsperentRequest request = new ProsperentRequest();
		request.setQuery("race cars");
		
		ProsperentProductResponse response = ProsperentAPI.getProsperentProductResponse(getString(R.string.prosperent_api_key), request);
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

!!TODO
- implement callbacks to avoid UI thread wait!
- better logging
- implement caching
- merchant api
- coupon api
More documentation to follow