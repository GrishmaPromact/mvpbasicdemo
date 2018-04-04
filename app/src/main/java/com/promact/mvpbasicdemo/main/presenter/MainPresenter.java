package com.promact.mvpbasicdemo.main.presenter;

import android.content.Context;
import android.util.Log;

import com.promact.mvpbasicdemo.main.view.MainContractor;

public class MainPresenter implements MainContractor.IMainPresenter {

    MainContractor.IMainView iMainView;
    Context context;

    public MainPresenter( Context context) {
        this.context = context;
    }

    public void setiMainView(MainContractor.IMainView iMainView) {
        this.iMainView = iMainView;
    }

    public MainPresenter() {
    }

    @Override
    public void callApi(String data) {
        Log.d("MVP:","call api");
        iMainView.showMsg("Please wait...");
        iMainView.processData("data received");
    }
}
