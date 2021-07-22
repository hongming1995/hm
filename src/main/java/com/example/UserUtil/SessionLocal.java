package com.example.UserUtil;


/**
 * ThreadLocal工具类
 */
public class SessionLocal {

    private static ThreadLocal<User> local = new ThreadLocal<User>();

    public static void setThread(User user) {
        local.set(user);
    }

    public static User getThread() {
        return local.get();
    }
}
