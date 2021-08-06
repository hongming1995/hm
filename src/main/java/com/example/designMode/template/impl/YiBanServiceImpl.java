package com.example.designMode.template.impl;

import com.example.designMode.template.TemplateExcutor;
import com.example.designMode.template.anno.TempAnno;
import org.springframework.stereotype.Service;

@Service
@TempAnno("yiban")
public class YiBanServiceImpl extends TemplateExcutor{
    @Override
    public void pay() {
        System.out.println("一般划款支付");
    }

    @Override
    public void check() {
        System.out.println("一般划款查证");
    }
}
