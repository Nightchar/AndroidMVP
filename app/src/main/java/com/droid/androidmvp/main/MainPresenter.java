package com.droid.androidmvp.main;

public interface MainPresenter {

    void onResume();

    void onItemClicked(int position);

    void onDestroy();
}
