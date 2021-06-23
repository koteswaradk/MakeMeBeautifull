package com.koteswara.makemebeautifull.di;

import com.koteswara.makemebeautifull.ui.cart.CartViewModel;
import com.koteswara.makemebeautifull.ui.details.DetailsViewModel;
import com.koteswara.makemebeautifull.ui.favarite.FavariteViewModel;
import com.koteswara.makemebeautifull.ui.home.HomeViewModel;
import com.koteswara.makemebeautifull.ui.search.SearchViewModel;
import com.koteswara.makemebeautifull.ui.userprofile.UserProfileViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RetroModule.class)
public interface RetroComponent {
    public void inject(HomeViewModel homeViewModel);
    public void inject(FavariteViewModel favariteViewModel );
    public void inject(SearchViewModel searchViewModel);
    public void inject(UserProfileViewModel userProfileViewModel);
    public void inject(CartViewModel cartViewModel);
    public void inject(DetailsViewModel detailsViewModel);
   



}
