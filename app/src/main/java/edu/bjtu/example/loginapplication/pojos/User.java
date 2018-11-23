package edu.bjtu.example.loginapplication.pojos;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    public String id;
    @SerializedName("name")
    public String name;
    @SerializedName("email")
    public String email;
    @SerializedName("password")
    public String password;
    @SerializedName("mobile")
    public String mobile;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
