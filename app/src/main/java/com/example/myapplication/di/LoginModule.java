package com.example.myapplication.di;

import com.example.myapplication.ui.LoginContract;
import com.example.myapplication.ui.LoginDataManager;
import com.example.myapplication.ui.LoginDataManagerInteractor;
import com.example.myapplication.ui.LoginModel;
import com.example.myapplication.ui.LoginPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginContract.Presenter providePresenter(LoginContract.Model model){
        return new LoginPresenter(model);
    }

    @Provides
    public LoginContract.Model provideModel(LoginDataManagerInteractor loginDataManagerInteractor){
        return new LoginModel(loginDataManagerInteractor);
    }

    @Provides
    public LoginDataManagerInteractor provideInteractor(){
        return new LoginDataManager();

    }}
