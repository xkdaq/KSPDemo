package com.account.rxvolley.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.convert.Converter;
import com.lzy.okrx2.adapter.ObservableBody;

import java.lang.reflect.Type;

import io.reactivex.Observable;
import okhttp3.Response;

public class ServiceApi {

    public static final String IS_LOGIN_KEY = "isLogin";
    public static final String USERNAME_KEY = "userName";

    public static final String BASE_URL = "http://wanandroid.com/";
    public static final String loginUrl = BASE_URL + "user/login";//登录

    private static Gson gson = new Gson();


    public static Observable<String> getHomeList() {
        return OkGo.<String>post(loginUrl)
                .params("ccode", "")
                .converter(new Converter<String>() {
                    @Override
                    public String convertResponse(Response response) throws Throwable {
                        Type type = new TypeToken<String>() {
                        }.getType();
                        assert response.body() != null;
                        return gson.fromJson(response.body().string(), type);
                    }
                })
                .adapt(new ObservableBody<String>());
    }


}
