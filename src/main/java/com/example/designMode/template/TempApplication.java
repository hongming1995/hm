package com.example.designMode.template;

import com.example.designMode.template.anno.TempAnno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TempApplication {
    Map<String, TemplateExcutor> map = new HashMap<>();

    @Autowired
    private TempApplication(Map<String, TemplateExcutor> tempMap) {
        for (TemplateExcutor templateExcutor : tempMap.values()) {
            TempAnno annotation = templateExcutor.getClass().getAnnotation(TempAnno.class);
            map.put(annotation.value(), templateExcutor);
        }
    }

    public void doPay(String temp) {
        TemplateExcutor templateExcutor = map.get(temp);
        templateExcutor.doPay();
    }
}
