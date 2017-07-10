package com.droid.androidmvp.login;

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
