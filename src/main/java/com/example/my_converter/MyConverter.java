package com.example.my_converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class MyConverter implements Converter<String, String> {
    @Override
    public String convert(String s) {
        String end = "";
        System.out.println("调用SpringMVC中转换器");
        if ("hm".equals(s)) {
            end = "洪明";
        }
        return end;
    }
}
