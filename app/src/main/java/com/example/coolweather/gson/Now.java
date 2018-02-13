package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：NaNianDeLongWu on 2018/2/13 23:19
 * 邮箱：guzhongbao0317@163.com
 */

/**
 * 包含当前的天气信息
 * */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public  More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }
}
