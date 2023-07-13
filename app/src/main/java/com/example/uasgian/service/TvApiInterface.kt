package com.example.uasgian.service

import com.example.uasgian.model.TvResponse
import retrofit2.Call
import retrofit2.http.GET

interface TvApiInterface {

    @GET("/3/tv/popular?api_key=601ba5b2e1ef0dad1cc14caa216e710a")
    fun getTVList(): Call<TvResponse>
}