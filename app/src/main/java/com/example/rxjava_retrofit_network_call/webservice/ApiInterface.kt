package com.example.rxjava_retrofit_network_call.webservice


import com.example.rxjava_retrofit_network_call.models.WeatherResponseDO
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    // https://api.darksky.net/forecast/166c199fe045e51a136adb2262e1fd86/37.8267,-122.4233

    @GET("forecast/{apikey}/{latlang}")
    fun getWeatherReport(@Path(value = "apikey", encoded = true) apiKey: String,
                         @Path(value = "latlang", encoded = true) latLang: String): Observable<WeatherResponseDO>

}

