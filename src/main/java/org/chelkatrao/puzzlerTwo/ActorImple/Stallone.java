package org.chelkatrao.puzzlerTwo.ActorImple;

import org.chelkatrao.puzzlerTwo.ActorInterfaces.Actor;
import org.chelkatrao.puzzlerTwo.annotationTypeActors.Action;
import org.chelkatrao.puzzlerTwo.annotationTypeActors.Comedy;
import org.springframework.stereotype.Component;

@Component
@Action
@Comedy
public class Stallone implements Actor {
    @Override
    public void play() {
        System.out.println("Stallone");
    }
}
