package com.account.rxvolley.presenter;

import com.account.rxvolley.api.ServiceApi;
import com.account.rxvolley.base.BasePresenter;
import com.account.rxvolley.net.RxObserver;
import com.account.rxvolley.view.HomeView;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class HomePresenter extends BasePresenter<HomeView> {

    public void getHomeList() {
        ServiceApi.getHomeList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new RxObserver<String>() {
                    @Override
                    public void _onNext(String bannerBeanResponseData) {
                        getMvpView().getDataError(bannerBeanResponseData);
                    }

                    @Override
                    public void _onError(String errorMessage) {
                        getMvpView().getDataError(errorMessage);
                    }
                });
    }


}
