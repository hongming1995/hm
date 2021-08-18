package com.example.designMode.testThreadLocal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyThreadLocal {
    private static ThreadLocal<List<String>> threadLocal = new ThreadLocal<>();

    private static ThreadLocal<String> mapLocal = new ThreadLocal<>();


    public static ThreadLocal<List<String>> getData() {
        List<String> list = threadLocal.get();
        if (list == null) {
            threadLocal.set(new ArrayList<>());
        }
        return threadLocal;
    }


    public static void removeThreadLocal() {
        threadLocal.remove();
    }

    public static void setMapValue(String num) {
        mapLocal.set(num);
    }

    public static String getMapValue() {
        return mapLocal.get();
    }

    public static void removeMapValue() {
        mapLocal.remove();
    }


}
