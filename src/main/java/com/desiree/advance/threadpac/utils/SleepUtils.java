package com.desiree.advance.threadpac.utils;

/**
 * @author dingxintian
 * @since 2021-08-16 14:23
 */
public class SleepUtils {

    public static void second(int i){

        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
