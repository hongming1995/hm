package com.example.designMode.springIOC.iocOne;

/**
 * @Author: hongming
 * @Date: 2024/03/14/22:26
 * @Description:
 */
public class DataSource {

    private String userName;

    private String passWord;

    private String url;

    public DataSource (String userName, String passWord, String url) {
        this.userName = userName;
        this.passWord = passWord;
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
