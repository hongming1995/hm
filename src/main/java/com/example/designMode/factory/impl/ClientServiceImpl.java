package com.example.designMode.factory.impl;

import com.example.designMode.factory.product_factory.DisposeProduct;
import com.example.designMode.factory.statusAnno.StatusAnno;
import org.springframework.stereotype.Service;

@Service
@StatusAnno("4")
public class ClientServiceImpl extends DisposeProduct{


    @Override
    public void sendProduct(String status){
        System.out.println("我已收到信息");
        System.out.println("------------------------");
        this.clientMessage();
    }

    @Override
    public void clientMessage() {
        System.out.println("我已点击确认收货");
    }
}
