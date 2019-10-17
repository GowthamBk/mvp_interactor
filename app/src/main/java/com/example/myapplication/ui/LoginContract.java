package com.example.myapplication.ui;

public interface LoginContract {

    interface View {

        void showError(String errorMessage);

        void success(String message);

    }

    interface Presenter {

        void setView(LoginContract.View view);

        void getUserNameAndPassword(String email, String password);

        void  getUserData();

    }

    interface Model {

        void success(String message);

        void getUserInfo(String email, String password, LoginContract.Presenter loginPresenter);

    }
}
