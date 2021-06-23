package com.koteswara.makemebeautifull;

import android.os.Bundle;

import com.koteswara.makemebeautifull.databinding.ActivityLoginAndSignUpactivityBinding;

import androidx.appcompat.app.AppCompatActivity;

public class LoginAndSignUPActivity extends AppCompatActivity {

    ActivityLoginAndSignUpactivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* binding= ActivityLoginAndSignUpactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());*/
        setContentView(R.layout.activity_login_and_sign_upactivity);

    }

}