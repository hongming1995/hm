package com.example.designMode.factory.status_enum;

public enum EStatusEnum {
    BUSINESS("1", "商家"),
    COURIER("2", "快递员"),
    TRANSFER_SHOP("3", "收货站"),
    CLIENT("4", "客户");

    private String key;

    private String value;

    EStatusEnum (String key, String value) {
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
