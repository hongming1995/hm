package com.example.designMode.Strategy.impl;

import com.example.designMode.Strategy.CaseExcutor;
import com.example.designMode.Strategy.anno.CaseAnno;
import com.example.designMode.Strategy.caseEnum.ECaseStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
@CaseAnno("yiban")
public class YibanCaseService extends CaseExcutor {
    private static Logger logger = LogManager.getLogger(YibanCaseService.class);


    @Override
    public void endCase() {
        logger.info("一般指令结束必须输出日志");
    }

    @Override
    public void caseStatus(String type) {
        if (ECaseStatus.YIBAN.getKey().equals(type)) {
            logger.info("一般指令核心");
        }
    }

    @Override
    public void beforeCase() {
        logger.info("一般指令开始需要输出日志");
    }
}
