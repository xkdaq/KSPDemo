package com.account.rxvolley.view;


import com.account.rxvolley.base.BaseMvpView;

public interface HomeView extends BaseMvpView {
    void showRefreshView(Boolean refresh);

    void getDataError(String errorMessage);
}
