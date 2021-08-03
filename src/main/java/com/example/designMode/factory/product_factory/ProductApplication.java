package com.example.designMode.factory.product_factory;

import com.example.designMode.factory.statusAnno.StatusAnno;
import com.example.designMode.factory.status_enum.EStatusEnum;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductApplication {

    private Map<String, DisposeProduct> map = new HashMap<>();

    public ProductApplication(Map<String, DisposeProduct> disposeProductMap) {
        for (DisposeProduct disposeProduct : disposeProductMap.values()) {
            StatusAnno status = disposeProduct.getClass().getAnnotation(StatusAnno.class);
            map.put(status.value(), disposeProduct);
        }
    }

    public void getMapValue(String status) {
        ProductFactory productFactory = map.get(status);
        productFactory.sendProduct(status);
    }
}
