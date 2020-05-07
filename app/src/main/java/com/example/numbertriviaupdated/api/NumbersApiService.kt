package com.example.numbertriviaupdated.api

import com.example.numbertriviaupdated.model.Trivia
import retrofit2.Call
import retrofit2.http.GET

public interface NumbersApiService {
    @GET("/random/trivia?json")
    fun getRandomNumberTrivia(): Call<Trivia>
}