package org.chelkatrao.puzzlerTwo.ActorImple;

import org.chelkatrao.puzzlerTwo.ActorInterfaces.Actor;
import org.springframework.stereotype.Component;

@Component
public class Katy implements Actor {
    @Override
    public void play() {
        System.out.println("Katy");
    }
}
