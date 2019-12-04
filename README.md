### RxJava_Retrofit_Network_Call
Sample project using weather api to get weather report (MVC, Rxjava 2, Retrofit 2)

### Overview

- Retrofit is a type-safe REST client for Android, Java and Kotlin developed by Square. The library provides a powerful framework for authenticating and interacting with APIs and sending network requests with OkHttp 

- This library makes downloading JSON or XML data from a web API fairly straightforward. Once the data is downloaded then it is parsed into a Plain Old Java Object (POJO) which must be defined for each "resource" in the response

### Setup

Make sure you require Internet permission in your manifest file.

``` <uses-permission android:name="android.permission.INTERNET" /> ``` 

We need following dependencies for this project. Add the lines below to your ```app/build.gradle``` in your app project under dependencies.

```
def rxjava_version ="2.1.8"
def rxandroid_version = "2.0.1"
def retrofit_version ="2.0.2"
def gson_version ="2.6.2"
def retrofit_adapter ="1.0.0"

dependencies 
{
	// Retrofit, Gson
	implementation "com.google.code.gson:gson:$gson_version"
	implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
	implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"
	implementation "com.jakewharton.retrofit:retrofit2-rxjava2-adapter:$retrofit_adapter"

	// RxJava2
	implementation "io.reactivex.rxjava2:rxjava:$rxjava_version"
	implementation "io.reactivex.rxjava2:rxandroid:$rxandroid_version"
}

```

### Output Demo

<img src="https://user-images.githubusercontent.com/10658016/70118797-e9173200-168e-11ea-8948-73a5c66f024c.png" alt="alt text" width="342" height="633">

