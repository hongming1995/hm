package com.example.designMode.testThreadLocal.demo1;

/**
 * @Author: hongming
 * @Date: 2024/03/12/23:11
 * @Description:
 */
public class UserThread {

    public static Runnable getThread(User user){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                UserThreadLocal.threadLocal.set(user);
                setMessage1();
            }
        };
        return runnable;
    }

    private static void setMessage1() {
        User user = UserThreadLocal.threadLocal.get();
        System.out.println(Thread.currentThread().getName() + "线程中用户id" + user.getUserId() + "用户名称" + user.getUserName());
        user.setUserName(user.getUserName() + "1");
        System.out.println(Thread.currentThread().getName() + "线程中修改后：用户id" + user.getUserId() + "用户名称" + user.getUserName());
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.setUserId("zhangsan");
        user1.setUserName("张三");
        new Thread(getThread(user1)).start();

        User user2 = new User();
        user2.setUserId("lisi");
        user2.setUserName("李四");
        new Thread(getThread(user2)).start();
    }
}
