package com.example.coolweather.gson;

/**
 * 作者：NaNianDeLongWu on 2018/2/13 23:21
 * 邮箱：guzhongbao0317@163.com
 */


import com.google.gson.annotations.SerializedName;

/**
 *包含一些天气相关的生活建议
 * */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
