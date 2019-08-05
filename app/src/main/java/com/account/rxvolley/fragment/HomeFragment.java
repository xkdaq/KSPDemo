package com.account.rxvolley.fragment;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.account.myapplication.R;
import com.account.rxvolley.base.BaseFragment;
import com.account.rxvolley.presenter.HomePresenter;
import com.account.rxvolley.view.HomeView;

import butterknife.BindView;

public class HomeFragment extends BaseFragment<HomePresenter, HomeView> implements HomeView{

    @BindView(R.id.recycle_home)
    RecyclerView recycleHome;
    @BindView(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefresh;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    protected HomePresenter createPresenter() {
        return new HomePresenter();
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView(View rootView) {

//        recycleHome.setLayoutManager(new LinearLayoutManager(getContext()));
//        mAdapter = new ArticleListAdapter(getContext(), null, 0);
//        recycleHome.setAdapter(mAdapter);
    }


    @Override
    public void getDataError(String errorMessage) {

    }

    @Override
    public void showProgress(String msg) {

    }

    @Override
    public void hideProgress() {

    }
}
