package com.example.demo;

import com.example.designMode.factory.ExcutorService;
import com.example.designMode.factory.status_enum.EStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryDemo {

    @Autowired
    private ExcutorService excutorService;

    @Test
    public void getbusiness() {
        excutorService.make(EStatusEnum.BUSINESS.getKey());
    }

    @Test
    public void getCourier() {
        excutorService.make(EStatusEnum.COURIER.getKey());
    }

    @Test
    public void getTransferShop() {
        excutorService.make(EStatusEnum.TRANSFER_SHOP.getKey());
    }

    @Test
    public void getClient() {
        excutorService.make(EStatusEnum.CLIENT.getKey());
    }
}
