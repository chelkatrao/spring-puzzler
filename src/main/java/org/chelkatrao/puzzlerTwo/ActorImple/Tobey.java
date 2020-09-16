package org.chelkatrao.puzzlerTwo.ActorImple;

import org.chelkatrao.puzzlerTwo.ActorInterfaces.Actor;
import org.chelkatrao.puzzlerTwo.annotationTypeActors.Action;
import org.springframework.stereotype.Component;

@Component
@Action
public class Tobey implements Actor {
    @Override
    public void play() {
        System.out.println("Tobey");
    }
}
