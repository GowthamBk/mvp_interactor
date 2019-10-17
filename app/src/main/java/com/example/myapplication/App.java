package com.example.myapplication;

import android.app.Application;

import com.example.myapplication.di.DaggerLoginComponent;
import com.example.myapplication.di.LoginComponent;
import com.example.myapplication.di.LoginModule;

public class App extends Application {

    private LoginComponent loginComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        loginComponent = DaggerLoginComponent.builder()
                .loginModule(new LoginModule())
                .build();
    }

    public LoginComponent getLoginComponent() {
        return loginComponent;
    }
}
