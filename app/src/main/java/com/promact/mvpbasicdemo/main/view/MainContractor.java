package com.promact.mvpbasicdemo.main.view;

public interface MainContractor {

    interface IMainView{

        void showProcess();

        void stopProcess();

        void showMsg(String msg);

        void processData(Object object);
    }

    interface IMainPresenter{

        void callApi(String data);
    }
}
