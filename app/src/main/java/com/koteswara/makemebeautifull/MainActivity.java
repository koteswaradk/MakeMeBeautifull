package com.koteswara.makemebeautifull;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.koteswara.makemebeautifull.databinding.BottomnavigationbarBinding;
import com.koteswara.makemebeautifull.ui.favarite.FavariteFragment;
import com.koteswara.makemebeautifull.ui.home.HomeFragment;
import com.koteswara.makemebeautifull.ui.search.SearchFragment;
import com.koteswara.makemebeautifull.ui.userprofile.UserProfileFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity  {

    BottomnavigationbarBinding bottomnavigationbarBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bottomnavigationbarBinding= BottomnavigationbarBinding.inflate(getLayoutInflater());
        setContentView(bottomnavigationbarBinding.getRoot());
        setUpBottomNavigationBar(bottomnavigationbarBinding);
        setCurrentFragement(new HomeFragment());

    }
    private void setUpBottomNavigationBar(BottomnavigationbarBinding binding){
       // binding.bottomNavigation.setSelectedItemId(R.id.bnavcenter);
        binding.bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bnavhome:
                      //  navController.navigate(R.id.action_nav_bootomnavbar_to_nav_Home);
                        setCurrentFragement(new HomeFragment());
                        Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bnavsearch:
                       // navController.navigate(R.id.action_nav_bootomnavbar_to_nav_Search);
                        setCurrentFragement(new SearchFragment());
                        Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bnavfavarite:
                       // navController.navigate(R.id.action_nav_bootomnavbar_to_nav_Favorite);
                        setCurrentFragement(new FavariteFragment());
                        Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bnavuser:
                       // navController.navigate(R.id.action_nav_bootomnavbar_to_nav_UserProfile);
                        setCurrentFragement(new UserProfileFragment());
                        Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
    private void setCurrentFragement(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();

    }

}