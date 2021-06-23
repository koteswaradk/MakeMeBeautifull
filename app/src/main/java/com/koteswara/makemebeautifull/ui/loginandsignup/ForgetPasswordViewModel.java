package com.koteswara.makemebeautifull.ui.loginandsignup;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ForgetPasswordViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ForgetPasswordViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}