package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：NaNianDeLongWu on 2018/2/13 23:06
 * 邮箱：guzhongbao0317@163.com
 */

/**
 * 此处由于Json中的一些字段可能不太适合直接作为Java字段来命名，因此这里使用了@SerializedName注解的方式来让Json字段和Java字段之间建立映射关系
 */

/**
 * 城市的基本信息
 * */
public class Basic {

    /**
     * 城市名
     */
    @SerializedName("city")
    public String cityName;

    /**
     * 城市对应的天气id
     */
    @SerializedName("id")
    public String weatherId;

    /**
     * 天气的更新时间
     */
    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
