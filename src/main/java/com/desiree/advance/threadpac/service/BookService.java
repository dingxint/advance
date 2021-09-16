package com.desiree.advance.threadpac.service;

import com.desiree.advance.threadpac.entity.Book;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author dingxintian
 * @since 2021-08-16 15:38
 */
@Service
public class BookService {

    ConcurrentHashMap<Long, Integer> conMap = new ConcurrentHashMap<>();

    public void save(Book book) {

        Long id = book.getId();

        conMap.computeIfAbsent(id, o -> 0);

        Integer integer = conMap.get(id);
        integer++;
    }

    public static final Map<String, Book> bookMap = new HashMap<>();

    @PostConstruct
    public void init() {
        Book book1 = new Book();
        book1.setName("红楼");
        book1.setNum(0);

        Book book2 = new Book();
        book2.setName("红楼");
        book2.setNum(0);
        bookMap.put("1", book1);
        bookMap.put("2", book2);
    }

    public void update(int num, String id) {

        synchronized (id) {
            Book book1 = bookMap.get(id);
            book1.setNum(book1.getNum() + num);
            bookMap.put(id, book1);
        }
    }

    public Integer getBookNum(String id) {
        Book book = bookMap.get(id);
        if (book != null) {
            return book.getNum();
        }
        return null;
    }

    // 数字增长
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);

    public void add() {

        int andIncrement = atomicInteger.getAndIncrement();
        System.out.println(andIncrement);
    }

    public int get() {
        return atomicInteger.get();
    }
}
