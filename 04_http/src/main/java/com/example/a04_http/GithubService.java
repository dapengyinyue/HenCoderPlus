package com.example.a04_http;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {

    @GET("users/rengwuxian/repos")
    Call<ResponseBody> listRepos();
}
