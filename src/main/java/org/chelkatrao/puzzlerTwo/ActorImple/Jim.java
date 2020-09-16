package org.chelkatrao.puzzlerTwo.ActorImple;

import org.chelkatrao.puzzlerTwo.ActorInterfaces.Actor;
import org.chelkatrao.puzzlerTwo.annotationTypeActors.Comedy;
import org.springframework.stereotype.Component;

@Component
@Comedy
public class Jim implements Actor {
    @Override
    public void play() {
        System.out.println("Jim");
    }
}
