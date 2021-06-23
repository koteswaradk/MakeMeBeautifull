package com.koteswara.makemebeautifull.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import dagger.Module;

@Module
public class MakeUpResponse {

	@SerializedName("Response")
	private List<ResponseItem> response;

	public void setResponse(List<ResponseItem> response){
		this.response = response;
	}

	public List<ResponseItem> getResponse(){
		return response;
	}
}