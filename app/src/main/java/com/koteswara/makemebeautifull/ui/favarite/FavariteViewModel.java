package com.koteswara.makemebeautifull.ui.favarite;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FavariteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FavariteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}