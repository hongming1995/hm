package com.example.designMode.factory.impl;

import com.example.designMode.factory.product_factory.DisposeProduct;
import com.example.designMode.factory.statusAnno.StatusAnno;
import org.springframework.stereotype.Service;

@Service
@StatusAnno("2")
public class CourierServiceImpl extends DisposeProduct{


    @Override
    public void sendProduct(String status){
        System.out.println("快递员已送货");
        System.out.println("------------------------");
        this.courierMessage();
    }

    @Override
    public void courierMessage() {
        System.out.println("快递员已送达中转站");
    }
}
