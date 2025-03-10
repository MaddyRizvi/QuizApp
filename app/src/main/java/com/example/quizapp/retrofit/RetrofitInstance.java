package com.example.quizapp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//4
public class RetrofitInstance {

    String baseURL = "http://10.0.2.2/quiz/";

    // Create and Return a configured Retrofit Instance
    public Retrofit getRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
