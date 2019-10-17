package com.example.myapplication.ui;

public interface LoginDataManagerInteractor {

    void getUserInfoFromServer(String email, String password, LoginModel loginModel);
}
