package com.koteswara.makemebeautifull.ui.loginandsignup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.koteswara.makemebeautifull.R;
import com.koteswara.makemebeautifull.databinding.NewusersigninBinding;

import org.jetbrains.annotations.NotNull;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginSignupFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginSignupFragment extends Fragment {
    NavController navController;
    NewusersigninBinding newusersigninBinding;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LoginSignupFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoginsignupFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginSignupFragment newInstance(String param1, String param2) {
        LoginSignupFragment fragment = new LoginSignupFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        NavHostFragment navHostFragment =
                (NavHostFragment)getActivity().getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
         navController = navHostFragment.getNavController();
        newusersigninBinding = NewusersigninBinding.inflate(inflater,container,false);
        return newusersigninBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        newusersigninBinding.bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputLayout textInputLayout= (TextInputLayout)view.findViewById(R.id.textinputunsername);
                TextInputEditText textInputEditText= (TextInputEditText)view.findViewById(R.id.textinputpassword);
                if (textInputLayout.getEditText().getText().toString().equalsIgnoreCase("kote")&&textInputEditText.getText().toString().equalsIgnoreCase("1234")){

                    navController.navigate(R.id.action_nav_LoginSignup_to_nav_bootomnavbar);

                }else {
                    Toast.makeText(getActivity(), "Fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
        newusersigninBinding.tSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_nav_LoginSignup_to_nav_CreateAccount);
            }
        });
        newusersigninBinding.tForgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_nav_LoginSignup_to_nav_ForgetPassword);
            }
        });

        
    }

}