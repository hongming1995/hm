package com.example.designMode.Strategy;


public abstract class CaseExcutor{

    public void getCaseStatus(String type) throws Exception{
        // 点对点
        beforeCase();
        // 策略模式核心
        caseStatus(type);
        // 广播形式
        endCase();
    }

    public void endCase(){

    }

    protected abstract void caseStatus(String type);

    public void beforeCase(){

    }
}
