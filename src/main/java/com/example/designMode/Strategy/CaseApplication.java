package com.example.designMode.Strategy;


import com.example.designMode.Strategy.anno.CaseAnno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CaseApplication{

    private Map<String, CaseExcutor> map = new HashMap<>();


    @Autowired
    private CaseApplication(Map<String, CaseExcutor> caseExcutor) {
        for (CaseExcutor excutor : caseExcutor.values()) {
            CaseAnno caseAnno = excutor.getClass().getAnnotation(CaseAnno.class);
            map.put(caseAnno.value(), excutor);
        }
    }

    public void sendStrategy(String type) throws Exception{
        CaseExcutor caseExcutor = map.get(type);
        caseExcutor.getCaseStatus(type);
    }
}
