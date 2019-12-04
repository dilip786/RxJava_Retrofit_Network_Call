package com.example.rxjava_retrofit_network_call.presenters

import com.example.rxjava_retrofit_network_call.models.WeatherResponseDO
import com.example.rxjava_retrofit_network_call.views.WeatherActivity
import com.example.rxjava_retrofit_network_call.webservice.ApiClient
import com.example.rxjava_retrofit_network_call.webservice.ApiInterface
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class WeatherPresenter(var view: WeatherActivity) {

    fun getWeatherInfo(
        countryName: String,
        apiKey: String,
        latitude: Double,
        longitude: Double
    ) {

        val apiService = ApiClient.client!!.create(ApiInterface::class.java)

        apiService.getWeatherReport(apiKey, "$latitude,$longitude").subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<WeatherResponseDO> {
                override fun onComplete() {
                }

                override fun onSubscribe(d: Disposable) {}

                override fun onNext(t: WeatherResponseDO) {

                    view.onSuccess(countryName, t)
                }

                override fun onError(e: Throwable) {
                    view.onFailure(e.message)
                }
            })
    }

    interface WeatherPresenterInterface {

        fun onSuccess(countryName: String, nearbyResponseDO: WeatherResponseDO)

        fun onFailure(message: String?)
    }
}



