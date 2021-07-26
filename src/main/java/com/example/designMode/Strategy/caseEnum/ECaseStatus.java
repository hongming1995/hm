package com.example.designMode.Strategy.caseEnum;

public enum ECaseStatus {

    YIBAN("yiban", "一般指令"),
    THREECASE("three", "三方指令");

    private String key;

    private String value;

    ECaseStatus(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
