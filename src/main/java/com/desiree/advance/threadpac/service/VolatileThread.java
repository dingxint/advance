package com.desiree.advance.threadpac.service;

/**
 * @author dingxintian
 * @since 2021-08-16 14:01
 */
public class VolatileThread implements Runnable {

    private volatile int a = 0;

    @Override
    public void run() {

        // 线程不安全
        a += 1;
        System.out.println(Thread.currentThread().getName() + "--------" + a);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a += 1;
        System.out.println(Thread.currentThread().getName() + "--------" + a);
    }
}
