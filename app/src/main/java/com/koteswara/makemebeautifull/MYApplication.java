package com.koteswara.makemebeautifull;

import android.app.Application;

import com.koteswara.makemebeautifull.di.DaggerRetroComponent;
import com.koteswara.makemebeautifull.di.RetroComponent;
import com.koteswara.makemebeautifull.di.RetroModule;

public class MYApplication extends Application {
    private RetroComponent retroComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        retroComponent= DaggerRetroComponent.builder()
                .retroModule(new RetroModule())
                .build();
    }
    public RetroComponent getRetroComponent(){
        return retroComponent;
    }

}
