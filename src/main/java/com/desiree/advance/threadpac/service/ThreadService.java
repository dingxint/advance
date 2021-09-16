package com.desiree.advance.threadpac.service;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author dingxintian
 * @since 2021-08-16 11:35
 */
@Slf4j
public class ThreadService {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        FutureTask<String> futureTask = new FutureTask<>(new Task());
        executorService.submit(futureTask);
        executorService.shutdown();
        System.out.println("主线程在执行任务...");

        try {
            Thread.sleep(2000);
            System.out.println("主线程任务完成...");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

        try {
            System.out.println("task运行结果:"+futureTask.get());
        } catch (InterruptedException | ExecutionException ex) {
            Thread.currentThread().interrupt();
            ex.printStackTrace();
        }

        System.out.println("所有任务执行完毕");
    }

    static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {

            System.out.println("子任务");
            Thread.sleep(5000);
            return "success";
        }
    }
}
