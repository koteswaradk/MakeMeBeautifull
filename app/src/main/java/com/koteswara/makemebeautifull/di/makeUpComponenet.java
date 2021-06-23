package com.koteswara.makemebeautifull.di;

import com.koteswara.makemebeautifull.model.MakeUpModel;
import com.koteswara.makemebeautifull.model.MakeUpResponse;
import com.koteswara.makemebeautifull.model.ResponseItem;

import dagger.Component;

@Component(modules = {MakeUpModel.class, ResponseItem.class, MakeUpResponse.class})
public interface makeUpComponenet {
}
