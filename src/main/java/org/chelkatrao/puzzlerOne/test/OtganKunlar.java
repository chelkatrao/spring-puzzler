package org.chelkatrao.puzzlerOne.test;

import org.springframework.stereotype.Component;

@Component("OtganKunlar")
public class OtganKunlar implements Book{
    @Override
    public String getName() {
        return "O'tgan kunlar";
    }
}
