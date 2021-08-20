package com.example.designMode.MyThreadPoolExecutor;

public class ThreadBody {

    private String threadId;

    private String threadName;

    /**
     * 是否等待主线程执行完成
     */
    private Boolean waitMaster;

    private Runnable runnable;

    public Runnable getRunnable() {
        return runnable;
    }

    public void setRunnable(Runnable runnable) {
        this.runnable = runnable;
    }

    /**
     *核心线程数
     */
    public static int corePoolSize = 5;

    /**
     * 最大线程数量
     */
    public static int maximumPoolSize = 10;

    /**
     * 线程多长空闲时间存活
     */
    public static long keepAliveTime = 0;

    public ThreadBody(String threadId, String threadName, Runnable runnable) {
        this.threadId = threadId;
        this.threadName = threadName;
        this.runnable = runnable;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public Boolean getWaitMaster() {
        return waitMaster;
    }

    public void setWaitMaster(Boolean waitMaster) {
        this.waitMaster = waitMaster;
    }
}
