package com.windrises.system.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/7/1 14:42
 */
public class CountDownLunchDemo implements Runnable {
    private static final CountDownLatch LATCH = new CountDownLatch(10);
    private static final CountDownLunchDemo DEMO = new CountDownLunchDemo();

    @Override
    public void run() {
        // 模拟检查任务
        try {
            synchronized (this) {
                //Thread.sleep(new Random().nextInt(10) * 1000);
                System.out.println("check complete" + LATCH.getCount());
                if (LATCH.getCount() == 4) {
                    System.out.println("第" + (10 - 4) + "个");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //计数减一
            //latch.countDown();方法作用是通知CountDownLatch有一个线程已经准备完毕，倒计数器可以减一了
            //放在finally避免任务执行过程出现异常，导致countDown()不能被执行
            LATCH.countDown();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            exec.submit(DEMO);
        }

        //latch.await()方法要求主线程等待所有10个检查任务全部准备好才一起并行执行。
        // 等待检查
        //使当前线程等待，直到闩锁计数到零，除非线程是{@linkplain thread #interrupt interrupted}。
        LATCH.await();

        // 发射火箭
        System.out.println("Fire!");
        // 关闭线程池
        exec.shutdown();
    }
}
