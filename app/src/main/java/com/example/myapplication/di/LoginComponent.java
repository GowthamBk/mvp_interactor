package com.example.myapplication.di;

import com.example.myapplication.ui.LoginActivity;

import dagger.Component;

@Component(modules = LoginModule.class)
public interface LoginComponent {

    void inject(LoginActivity loginActivity);

}
