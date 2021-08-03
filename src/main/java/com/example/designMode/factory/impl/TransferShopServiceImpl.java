package com.example.designMode.factory.impl;

import com.example.designMode.factory.product_factory.DisposeProduct;
import com.example.designMode.factory.statusAnno.StatusAnno;
import org.springframework.stereotype.Service;

@Service
@StatusAnno("3")
public class TransferShopServiceImpl extends DisposeProduct{


    @Override
    public void sendProduct(String status){
        System.out.println("收货站已收货");
        System.out.println("------------------------");
        this.transferShopMessage();
    }

    @Override
    public void transferShopMessage() {
        System.out.println("XXX快递已到，请尽快来拿");
    }
}
