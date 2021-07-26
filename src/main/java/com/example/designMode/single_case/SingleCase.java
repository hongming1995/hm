package com.example.designMode.single_case;

/**
 * 设计模式中的单例模式
 */
public class SingleCase {

    private static SingleCase singleCase = new SingleCase();

    private SingleCase() {

    }

    public static SingleCase getSingleCase() {
        if (singleCase == null) {
            singleCase = new SingleCase();
        }
        return singleCase;
    }


}
