package com.example.designMode.Strategy.impl;

import com.example.designMode.Strategy.CaseExcutor;
import com.example.designMode.Strategy.anno.CaseAnno;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
@CaseAnno("three")
public class ThreeCaseService extends CaseExcutor {
    private static Logger logger = LogManager.getLogger(ThreeCaseService.class);
    @Override
    public void caseStatus(String type) {
        if ("three".equals(type)) {
            logger.info("三方核心指令");
        }
    }

    @Override
    public void endCase() {
        logger.info("三方结束必须执行日志");
    }
}
