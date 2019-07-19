package com.example.marking.Remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface lGoogleAPIService {
    @GET
    fun getNearbyPlaces (@Url url: String):Call<>
}