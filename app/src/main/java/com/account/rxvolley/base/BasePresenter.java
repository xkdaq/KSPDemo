package com.account.rxvolley.base;

public class BasePresenter<V extends BaseMvpView> {
    public V mvpView;

    public void attachView(V view) {
        this.mvpView = view;
    }

    public void detachView() {
        this.mvpView = null;
    }

    public boolean isAttachView() {
        return mvpView != null;
    }

    public V getMvpView() {
        return mvpView;
    }
}
