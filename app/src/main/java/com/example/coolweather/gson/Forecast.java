package com.example.coolweather.gson;

/**
 * 作者：NaNianDeLongWu on 2018/2/13 23:26
 * 邮箱：guzhongbao0317@163.com
 */

import com.google.gson.annotations.SerializedName;

/**
 * 未来几天的天气情况
 * */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Tmperature tmperature;

    @SerializedName("cond")
    public More more;

    public class Tmperature{
        public String max;

        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
