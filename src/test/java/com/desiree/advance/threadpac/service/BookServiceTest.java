package com.desiree.advance.threadpac.service;

import com.desiree.advance.threadpac.utils.SleepUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class BookServiceTest {

    @Resource
    private BookService bookService;

    private static final ExecutorService service = Executors.newCachedThreadPool();

    @Test
    public void add() {

        for (int i = 0; i < 100; i++) {
            service.execute(() -> {
                bookService.add();
            });
        }

        service.shutdown();
        try {
            boolean b = service.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int i = bookService.get();
        Assertions.assertEquals(100, i);
    }

    @Test
    public void update() {

        for (int i = 0; i < 100; i++) {
            service.execute(() -> {
                bookService.update(1,"1");
            });
        }

        service.shutdown();
        try {
            // 等待结束
            boolean b = service.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int i = bookService.getBookNum("1");
        Assertions.assertEquals(100, i);
    }
}