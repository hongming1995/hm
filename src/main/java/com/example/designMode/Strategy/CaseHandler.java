package com.example.designMode.Strategy;

/**
 * 策略模式
 */
public interface CaseHandler {
    /**
     * 获取不同的渠道的指令状态
     * @throws Exception
     */
    void getCaseStatus() throws Exception;
}
