package com.example.coolweather.gson;

/**
 * 作者：NaNianDeLongWu on 2018/2/13 23:16
 * 邮箱：guzhongbao0317@163.com
 */

/**
 *当前空气质量情况
 * */
public class AQI {

    private AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
