package com.example.designMode.template;

import org.springframework.stereotype.Service;

/**
 * 模板模式
 */
@Service
public abstract class TemplateExcutor {

    public void doPay() {
        // 支付
        pay();
        // 查证
        check();
        // 需要特殊处理
        needMake();
    }

    public abstract void pay();

    public abstract void check();

    public void needMake() {

    }
}
