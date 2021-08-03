package com.example.designMode.factory.impl;

import com.example.designMode.factory.product_factory.DisposeProduct;
import com.example.designMode.factory.statusAnno.StatusAnno;
import org.springframework.stereotype.Service;

@Service
@StatusAnno("1")
public class businessServiceImpl extends DisposeProduct{


    @Override
    public void sendProduct(String status){
        System.out.println("商家以打包商品");
        System.out.println("------------------------");
        this.businessMessage();
    }

    @Override
    public void businessMessage() {
        System.out.println("商家已发货");
    }
}
