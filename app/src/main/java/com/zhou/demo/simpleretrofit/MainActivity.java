package com.zhou.demo.simpleretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private HttpApi mHttpApi;
//    private HttpToken mToken;
//    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHttpApi = new HttpApi(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
//                Map<String,Object> data = new HashMap<>(0);
////                data.put("companyId", "e10adc3949ba59abbe56e057f20f883e");
////                data.put("password", "dc483e80a7a0bd9ef71d8cf973673924");
////                data.put("plainText", "a123456");
////                data.put("userName", "18566266085");
////                mHttpApi.login(data, new HttpFormatCallback<HttpToken>() {
////                    @Override
////                    public void onSuccess(Call<HttpResponse<HttpToken>> call, HttpToken data) {
////                        Logger.i("onResponse:" + data);
////                        mToken = data;
////                    }
////
////                    @Override
////                    public void onFailure(Call<HttpResponse<HttpToken>> call, int code, String error) {
////                        Logger.i("onFailure:" + code + "==" + error);
////                    }
////                });
                Map<String, Object> data = new HashMap<>(0);
                data.put("start", 25);
                data.put("count", 25);
                mHttpApi.getMovies(data);
                break;
            case R.id.user:
//                mHttpApi.getUser(mToken.getToken(), new HttpFormatCallback<User>() {
//                    @Override
//                    public void onSuccess(Call<HttpResponse<User>> call, User data) {
//                        Logger.i("onResponse:" + data);
//                        mUser = data;
//                    }
//
//                    @Override
//                    public void onFailure(Call<HttpResponse<User>> call, int code, String error) {
//                        Logger.i("onFailure:" + code + "==" + error);
//                    }
//                });
                break;
            case R.id.devices:
//                Map<String, String> parms = new HashMap<>(0);
//                parms.put("companyId", "e10adc3949ba59abbe56e057f20f883e");
//                parms.put("userId", mUser.getUserId());
//                mHttpApi.getDeviceList(mToken.getToken(), parms, new HttpFormatCallback<List<Device>>() {
//                    @Override
//                    public void onSuccess(Call<HttpResponse<List<Device>>> call, List<Device> data) {
//                        Logger.i("onResponse:" + data);
//                    }
//
//                    @Override
//                    public void onFailure(Call<HttpResponse<List<Device>>> call, int code, String error) {
//                        Logger.i("onFailure:" + code + "==" + error);
//                    }
//                });
                break;
            default:
                break;
        }
    }
}
