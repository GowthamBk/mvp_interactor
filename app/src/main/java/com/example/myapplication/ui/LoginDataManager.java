package com.example.myapplication.ui;

import com.example.myapplication.data.Api;
import com.example.myapplication.data.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginDataManager implements LoginDataManagerInteractor {

    Api api = ApiClient.getClient().create(Api.class);

    @Override
    public void getUserInfoFromServer(String email, String password, final LoginModel loginModel) {
        Call<Void> loginSuccess = api.userLogin(email, password);

        loginSuccess.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                loginModel.success("Success");
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
    }
}
