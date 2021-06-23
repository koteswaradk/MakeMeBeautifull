package com.koteswara.makemebeautifull.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.koteswara.makemebeautifull.databinding.ItemCardviewBinding;
import com.koteswara.makemebeautifull.model.ResponseItem;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<HomeRecyclerViewAdapter.HomeRecycleViewHolder> {
     Context context;
    List<ResponseItem> makeUpResponseItems;
    ItemCardviewBinding  itemCardviewBinding;
    /*public void setListData(List<ResponseItem> responseItems){
        makeUpResponseItems = responseItems;
    }*/
    public HomeRecyclerViewAdapter(Context context, ArrayList<ResponseItem> responseItems){
        this.context=context;
        this.makeUpResponseItems=responseItems;

    }
    @NonNull
    @NotNull
    @Override
    public HomeRecycleViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        itemCardviewBinding = ItemCardviewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new HomeRecycleViewHolder(itemCardviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull HomeRecycleViewHolder holder, int position) {
        itemCardviewBinding.tname.setText("Name: "+makeUpResponseItems.get(position).getName());
        itemCardviewBinding.price.setText("Price: "+makeUpResponseItems.get(position).getPrice());
        itemCardviewBinding.rating.setText("Rating: "+String.valueOf(makeUpResponseItems.get(position).getRating()));
        itemCardviewBinding.producttype.setText("Product Type:  "+makeUpResponseItems.get(position).getProductType());
        Glide.with(itemCardviewBinding.pimage).load(makeUpResponseItems.get(position)
                .getImageLink()).apply(RequestOptions.centerCropTransform()).into(itemCardviewBinding.pimage);
        onEventHandling(position);
    }

    @Override
    public int getItemCount() {

        if (makeUpResponseItems!=null){

            return makeUpResponseItems.size();

        }else{

            return 0;
        }

    }
    public void onEventHandling(int position){
        itemCardviewBinding.pimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "position clicked "+position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public class HomeRecycleViewHolder extends RecyclerView.ViewHolder {

        public HomeRecycleViewHolder(@NonNull ItemCardviewBinding binding) {
            super(itemCardviewBinding.getRoot());
            itemCardviewBinding = binding;
        }
    }
}
