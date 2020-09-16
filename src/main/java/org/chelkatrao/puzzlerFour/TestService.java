package org.chelkatrao.puzzlerFour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestService {

    @Autowired
    private String string;

    @PostConstruct
    public void init() {
        System.out.println("********** - " + string);
    }

}
