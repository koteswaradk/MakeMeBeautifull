package com.koteswara.makemebeautifull.ui.home;

import android.app.Application;

import com.koteswara.makemebeautifull.MYApplication;
import com.koteswara.makemebeautifull.di.RetroServiceAPIInterface;
import com.koteswara.makemebeautifull.model.ResponseItem;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class HomeViewModel extends AndroidViewModel {

    @Inject
    RetroServiceAPIInterface retroServiceAPIInterface;

     HomeFragmentRepository homeFragmentRepository;

     MutableLiveData<List<ResponseItem>> responseItemMutableLiveData;

    public HomeViewModel(@NonNull @NotNull Application application) {

        super(application);
        ((MYApplication)application).getRetroComponent().inject(HomeViewModel.this);
        homeFragmentRepository=new HomeFragmentRepository();
        responseItemMutableLiveData=homeFragmentRepository.getResponseFromAPICall();
    }
    public MutableLiveData<List<ResponseItem>> getResponseItem() {

        return  responseItemMutableLiveData;
    }

   /* public void makeApiCall(){
        Call<List<ResponseItem>> call =retroServiceAPIInterface.getDataFromAPI();
        call.enqueue(new Callback<List<ResponseItem>>() {
            @Override
            public void onResponse(Call<List<ResponseItem>> call, Response<List<ResponseItem>> response) {
              //  Log.d("View model", "onResponse: "+response.toString());
                if (response.isSuccessful()){
                    responseItemMutableLiveData.postValue(response.body());
                }else{
                    responseItemMutableLiveData.postValue(null);
                }
            }

            @Override
            public void onFailure(Call<List<ResponseItem>> call, Throwable t) {
                Log.d("View model Failure", "Failure: "+t.getMessage());
            }

        });
    }*/

}