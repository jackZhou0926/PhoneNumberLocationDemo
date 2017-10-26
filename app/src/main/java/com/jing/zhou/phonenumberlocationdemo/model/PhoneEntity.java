package com.jing.zhou.phonenumberlocationdemo.model;

import java.io.Serializable;

/**
 *
 * @author hbhd
 * @date 2017-10-25
 */

public class PhoneEntity implements Serializable {
    private String locationOperator;
    private String operator;
    private String phoneNum;
    private String province;

    @Override
    public String toString() {
        return "PhoneEntity{" +
                "locationOperator='" + locationOperator + '\'' +
                ", operator='" + operator + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    public String getLocationOperator() {
        return locationOperator;
    }

    public void setLocationOperator(String locationOperator) {
        this.locationOperator = locationOperator;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
