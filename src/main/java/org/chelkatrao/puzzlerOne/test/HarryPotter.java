package org.chelkatrao.puzzlerOne.test;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("HarryPotter")
public class HarryPotter implements Book {
    @Override
    public String getName() {
        return "HarryPotter";
    }
}
