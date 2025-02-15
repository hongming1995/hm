package com.example.collection.MyCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Author: hongming
 * @Date: 2025/02/10/22:16
 * @Description:
 */
public class MyCollectionOnlyRead {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        Collection<String> modifyList = Collections.unmodifiableCollection(list);
        modifyList.add("b");
    }
}
