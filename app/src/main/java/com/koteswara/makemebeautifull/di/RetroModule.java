package com.koteswara.makemebeautifull.di;

import com.koteswara.makemebeautifull.util.Constants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RetroModule {

    @Provides
    @Singleton
  public RetroServiceAPIInterface  getRetroServiceAPIInterface(Retrofit retrofit){
       return retrofit.create(RetroServiceAPIInterface.class);

    }
    @Provides
    @Singleton
    public Retrofit getRetrofitInstance(){
        HttpLoggingInterceptor interceptor=new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        return retrofit;

        }


}
