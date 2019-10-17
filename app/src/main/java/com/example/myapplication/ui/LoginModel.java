package com.example.myapplication.ui;

public class LoginModel implements LoginContract.Model {

    private LoginDataManagerInteractor loginDataManagerInteractor;
    private LoginContract.Presenter presenter;

    public LoginModel(LoginDataManagerInteractor loginDataManagerInteractor) {
        this.loginDataManagerInteractor = loginDataManagerInteractor;
    }

    @Override
    public void success(String message) {
        presenter.getUserData();
    }

    @Override
    public void getUserInfo(String email, String password, LoginContract.Presenter loginPresenter) {
        this.presenter = loginPresenter;
        loginDataManagerInteractor.getUserInfoFromServer(email, password, this);
    }

   /* @Override
    public void getUserInfo(String email, String password, LoginPresenter loginModel) {
        this.presenter = loginModel;
        loginDataManagerInteractor.getUserInfoFromServer(email, password, this);
    }*/
}
