package org.chelkatrao.puzzlerOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BaruchService {
    @Autowired
    @BaruchQualifier
    private List<String> strings;

    @PostConstruct
    private void init() {
        strings.forEach(System.out::println);
    }
}
