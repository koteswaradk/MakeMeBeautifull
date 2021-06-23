package com.koteswara.makemebeautifull.model;

import com.google.gson.annotations.SerializedName;

import dagger.Module;

@Module
public class ProductColorsItem{

	@SerializedName("colour_name")
	private String colourName;

	@SerializedName("hex_value")
	private String hexValue;

	public void setColourName(String colourName){
		this.colourName = colourName;
	}

	public String getColourName(){
		return colourName;
	}

	public void setHexValue(String hexValue){
		this.hexValue = hexValue;
	}

	public String getHexValue(){
		return hexValue;
	}
}