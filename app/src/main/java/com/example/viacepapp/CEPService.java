package com.example.viacepapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CEPService {

    @GET("ws/{cep}/json/")
    Call<CEP> findCEP(@Path("cep") String cep);
}
