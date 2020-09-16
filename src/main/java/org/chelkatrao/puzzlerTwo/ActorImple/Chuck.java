package org.chelkatrao.puzzlerTwo.ActorImple;

import org.chelkatrao.puzzlerTwo.ActorInterfaces.Actor;
import org.chelkatrao.puzzlerTwo.annotationTypeActors.AnyGenre;
import org.springframework.stereotype.Component;

@Component
@AnyGenre
public class Chuck implements Actor {
    @Override
    public void play() {
        System.out.println("Chuck");
    }
}
