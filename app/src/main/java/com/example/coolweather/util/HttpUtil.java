package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 作者：NaNianDeLongWu on 2018/2/11 00:10
 * 邮箱：guzhongbao0317@163.com
 */

public class HttpUtil {
    /**
     * 由于Okhttp的出色封装，这里与服务器交互的代码非常简单，在我们发起一条HTTP请求只需要调用sendOKHttpRequest()
     * ，传入请求地址，并注册一个回调来处理服务器响应就可以了
     */
    public static void sendOKHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
