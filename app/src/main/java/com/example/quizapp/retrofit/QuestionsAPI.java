package com.example.quizapp.retrofit;

import com.example.quizapp.model.QuestionList;

import retrofit2.Call;
import retrofit2.http.GET;

//3
public interface QuestionsAPI {
    // Used to define the structure and behaviour of
    // network requests to a RESTFul API
    // Acts as a bridge between android app and the web service

    @GET("myquizapi.php") // end point
    Call<QuestionList> getQuestions();


}
