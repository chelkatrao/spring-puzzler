package org.chelkatrao.puzzlerOne.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Component
public class Test {

    @Autowired
    private List<Book> booksList;

    @Autowired
    private Map<String, Book> booksMap;

    @PostConstruct
    public void init() {
        booksList.forEach(book -> {
            System.out.println(book.getName() + " list ");
        });

        Book harryPotter = booksMap.get("HarryPotter");
        System.out.println(harryPotter.getName() + " from Map");
    }

}
