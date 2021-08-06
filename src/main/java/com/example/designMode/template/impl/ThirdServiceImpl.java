package com.example.designMode.template.impl;

import com.example.designMode.template.TemplateExcutor;
import com.example.designMode.template.anno.TempAnno;
import org.springframework.stereotype.Service;

@Service
@TempAnno("third")
public class ThirdServiceImpl extends TemplateExcutor {
    @Override
    public void pay() {
        System.out.println("三方划款支付");
    }

    @Override
    public void check() {
        System.out.println("三方划款查证");
    }

    @Override
    public void needMake() {
        System.out.println("三方划款修改状态");
    }
}
