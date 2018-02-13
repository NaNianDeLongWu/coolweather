package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：NaNianDeLongWu on 2018/2/13 23:29
 * 邮箱：guzhongbao0317@163.com
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    //由于daily_forecast包含的是一个数组，因此使用List集合来引用Forecast类
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
