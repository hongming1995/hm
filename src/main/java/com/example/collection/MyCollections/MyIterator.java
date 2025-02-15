package com.example.collection.MyCollections;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: hongming
 * @Date: 2025/02/10/22:04
 * @Description:
 */
public class MyIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (StringUtils.equals("d", next)) {
                iterator.remove();
                continue;
            }
            System.out.println(next);
        }
    }
}
