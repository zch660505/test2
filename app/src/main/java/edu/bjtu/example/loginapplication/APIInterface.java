package edu.bjtu.example.loginapplication;

import java.util.List;

import edu.bjtu.example.loginapplication.pojos.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by anupamchugh on 09/01/17.
 */

interface APIInterface {

    @GET("users/")
    Call<List<User>> doGetListResources();

    @GET("users/{id}")
    Call<User> doGetUser(@Path("id") String id );

    @POST("/api/users/")
    Call<User> createUser(@Body User user);

}
