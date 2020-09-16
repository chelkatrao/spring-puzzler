package org.chelkatrao.puzzlerOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class JekaService {
    @Autowired
    @JekaQualifier
    private List<String> list;

    @PostConstruct
    private void init() {
        list.forEach(System.out::println);
    }
}
