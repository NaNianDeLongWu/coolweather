package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 作者：NaNianDeLongWu on 2018/2/11 00:00
 * 邮箱：guzhongbao0317@163.com
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
