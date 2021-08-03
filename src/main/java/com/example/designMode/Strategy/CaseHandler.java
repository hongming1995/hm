package com.example.designMode.Strategy;

/**
 * 策略模式
 */
public interface CaseHandler {
    /**
     * 获取三方的渠道的指令状态
     * @throws Exception
     */
    void getCaseStatus() throws Exception;

    /**
     * 获取一般渠道
     * @throws Exception
     */
    void getYiBanCaseStatus() throws Exception;
}
