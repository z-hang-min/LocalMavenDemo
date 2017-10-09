package com.hisnow.androidlib;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by Administrator on 2017/10/9 0009.
 */

public class OkHttpUtils {
    public static String testStr(String s) {
        return s;
    }

    public static String testHttp(String url) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            if (response.isSuccessful()) {
                return response.body().string();
            } else {
                throw new IOException("Unexpected code " + response);
            }
        } catch (IOException e) {
            return e.getMessage().toString();
        }
    }
}

