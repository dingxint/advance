package com.desiree.advance.threadpac.service;

import com.desiree.advance.threadpac.utils.SleepUtils;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    private static ExecutorService service = Executors.newCachedThreadPool();

    private static Semaphore sp = new Semaphore(3);

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            SleepUtils.second(1);
//            Runnable runnable = () -> {
//                try {
//                    sp.acquire();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("线程" + Thread.currentThread().getName() +
//                        "进入，当前已有" + (3 - sp.availablePermits()) + "个并发");
//
//                Random random = new Random();
//                SleepUtils.second(random.nextInt(6));
//                System.out.println("线程" + Thread.currentThread().getName() +
//                        "即将离开");
//                sp.release();
//                System.out.println("线程" + Thread.currentThread().getName() +
//                        "已离开，当前已有" + (3 - sp.availablePermits()) + "个并发");
//            };
            SemaphoreTest semaphoreTest = new SemaphoreTest();
            service.execute(semaphoreTest::run2);
        }
    }

    public void run2(){
        System.out.println(3);
    }

    public static void run() {
        try {
            sp.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程" + Thread.currentThread().getName() +
                "进入，当前已有" + (3 - sp.availablePermits()) + "个并发");

        Random random = new Random();
        SleepUtils.second(random.nextInt(6));
        System.out.println("线程" + Thread.currentThread().getName() +
                "即将离开");
        sp.release();
        System.out.println("线程" + Thread.currentThread().getName() +
                "已离开，当前已有" + (3 - sp.availablePermits()) + "个并发");
    }
}
