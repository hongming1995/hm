package com.example.model;

/**
 * @Author: hongming
 * @Date: 2021/09/18/16:21
 * @Description:
 */
public class User {

    private String pkId;
    private String userId;
    private String userName;
    private String sex;

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "pkId='" + pkId + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
