package com.koteswara.makemebeautifull.model;

import dagger.Module;

@Module
public class MakeUpModel {

    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("description")
    private String description;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("website_link")
    private String website_link;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("product_link")
    private String product_link;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("image_link")
    private String image_link;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("currency")
    private String currency;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("price_sign")
    private String price_sign;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("price")
    private String price;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("name")
    private String name;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("brand")
    private String brand;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("id")
    private int id;
}
