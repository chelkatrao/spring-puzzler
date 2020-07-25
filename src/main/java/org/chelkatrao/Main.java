package org.chelkatrao;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("org.chelkatrao", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));

        CoronaDisinfection disinfection = context.getObject(CoronaDisinfection.class);
        disinfection.start(new Room());
    }
}
