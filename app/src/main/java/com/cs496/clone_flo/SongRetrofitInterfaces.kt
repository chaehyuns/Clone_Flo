package com.cs496.clone_flo

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface SongRetrofitInterfaces {
    @GET("/songs")
    fun getSongs(): Call<SongResponse>
}