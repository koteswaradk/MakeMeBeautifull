package com.koteswara.makemebeautifull.ui.home;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.koteswara.makemebeautifull.databinding.LandingpagBinding;
import com.koteswara.makemebeautifull.model.ResponseItem;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

public class HomeFragment extends Fragment {
    ProgressDialog progressDoalog;
    private static final String TAG = "HomeFragment";
    private HomeViewModel homeViewModel;
    HomeRecyclerViewAdapter recyclerViewAdapter;
    public ArrayList<ResponseItem> ItemList = new ArrayList<>();
    LandingpagBinding landingpagBinding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        landingpagBinding = LandingpagBinding.inflate(inflater,container,false);
        return landingpagBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        progressDialog();
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        homeViewModel.getResponseItem().observe(getViewLifecycleOwner(), new Observer<List<ResponseItem>>() {
            @Override
            public void onChanged(List<ResponseItem> responseItems) {
                ItemList.addAll(responseItems);
                if (responseItems!=null){
                    generateDataList(ItemList);
                    progressDoalog.cancel();
                }else {
                    progressDoalog.cancel();
                    Toast.makeText(getActivity(), "unable to fetch", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    private void generateDataList(ArrayList<ResponseItem> ItemList) {

        recyclerViewAdapter=new HomeRecyclerViewAdapter(getActivity(),ItemList);
        landingpagBinding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        landingpagBinding.recyclerView.setAdapter(recyclerViewAdapter);
        landingpagBinding.recyclerView.setHasFixedSize(true);
        recyclerViewAdapter.notifyDataSetChanged();
    }
    private void progressDialog(){
        progressDoalog = new ProgressDialog(getActivity());
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();
    }
}