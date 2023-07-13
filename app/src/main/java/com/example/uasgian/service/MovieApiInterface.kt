package com.example.uasgian.service

import com.example.uasgian.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=601ba5b2e1ef0dad1cc14caa216e710a")
    fun getMovieList(): Call<MovieResponse>
}