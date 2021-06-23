package com.koteswara.makemebeautifull.ui.home;

import com.koteswara.makemebeautifull.di.RetroServiceAPIInterface;
import com.koteswara.makemebeautifull.di.RetrofitClientInstance;
import com.koteswara.makemebeautifull.model.ResponseItem;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragmentRepository {

    MutableLiveData<List<ResponseItem>> responseItemMutableLiveData;

    public MutableLiveData<List<ResponseItem>> getResponseFromAPICall(){
        responseItemMutableLiveData=new MutableLiveData<>();
        RetroServiceAPIInterface apiInterface=  RetrofitClientInstance.getClient().create(RetroServiceAPIInterface.class);
       Call<List<ResponseItem>> responseItemCall= apiInterface.getDataFromAPI();


        responseItemCall.enqueue(new Callback<List<ResponseItem>>() {
            @Override
            public void onResponse(Call<List<ResponseItem>> call, Response<List<ResponseItem>> response) {
                if (response.isSuccessful()){
                    responseItemMutableLiveData.postValue(response.body());
                }else {
                    responseItemMutableLiveData.postValue(null);
                }
            }

            @Override
            public void onFailure(Call<List<ResponseItem>> call, Throwable t) {
                responseItemMutableLiveData.postValue(null);
            }
        });
        return responseItemMutableLiveData;
    }



}
