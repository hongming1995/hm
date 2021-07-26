package com.example.designMode.Strategy.impl;

import com.example.designMode.Strategy.CaseApplication;
import com.example.designMode.Strategy.CaseHandler;
import com.example.designMode.Strategy.caseEnum.ECaseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseHandlerServiceImpl implements CaseHandler{

    @Autowired
    private CaseApplication caseApplication;


    @Override
    public void getCaseStatus() throws Exception {
        caseApplication.sendStrategy(ECaseStatus.THREECASE.getKey());
    }
}
