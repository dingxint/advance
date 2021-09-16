package com.desiree.advance.threadpac.service;

/**
 * @author dingxintian
 * @since 2021-08-16 14:04
 */
public class ThreadTest {

    public static void main(String[] args) {

        ThreadTest threadTest = new ThreadTest();

        threadTest.testVolatile();
    }

    public void testVolatile(){

        VolatileThread volatileThread = new VolatileThread();

        Thread t1 = new Thread(volatileThread);
        Thread t2 = new Thread(volatileThread);
        Thread t3 = new Thread(volatileThread);
        Thread t4 = new Thread(volatileThread);
        Thread t5 = new Thread(volatileThread);
        Thread t6 = new Thread(volatileThread);
        Thread t7 = new Thread(volatileThread);
        Thread t8 = new Thread(volatileThread);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }

}
