package com.example.myapplication.ui;

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View view;
    private LoginContract.Model model;

    public LoginPresenter(LoginContract.Model model) {
        this.model = model;
    }

    @Override
    public void setView(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void getUserNameAndPassword(String email, String password) {
        if (email != null && password != null) {
            model.getUserInfo(email, password, this);
        } else {
            view.showError("Please enter email and password");
        }
    }

    @Override
    public void getUserData() {
        view.success("success");
    }
}
