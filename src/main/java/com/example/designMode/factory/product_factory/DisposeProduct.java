package com.example.designMode.factory.product_factory;

import org.springframework.stereotype.Service;

@Service
public abstract class DisposeProduct implements ProductFactory{


    @Override
    public void sendProduct(String status){

    }

    /**
     * 商家发送消息
     */
    public void businessMessage() {

    }

    /**
     * 快递员发送消息
     */
    public void courierMessage() {

    }

    /**
     * 收货站
     */
    public void transferShopMessage() {

    }

    /**
     * 客户接收消息
     */
    public void clientMessage() {

    }
}
