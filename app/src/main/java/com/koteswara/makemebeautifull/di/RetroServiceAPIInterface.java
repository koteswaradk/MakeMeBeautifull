package com.koteswara.makemebeautifull.di;

import com.koteswara.makemebeautifull.model.ResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetroServiceAPIInterface {

     @GET("/api/v1/products.json?brand=maybelline")
     Call<List<ResponseItem>> getDataFromAPI();

}
