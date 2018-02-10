package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 作者：NaNianDeLongWu on 2018/2/10 23:56
 * 邮箱：guzhongbao0317@163.com
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
