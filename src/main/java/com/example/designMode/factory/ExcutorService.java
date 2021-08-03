package com.example.designMode.factory;

import com.example.designMode.factory.product_factory.ProductApplication;
import com.example.designMode.factory.product_factory.ProductFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcutorService {

    @Autowired
    private ProductApplication productApplication;

    public void make(String status) {
        productApplication.getMapValue(status);
    }
}
