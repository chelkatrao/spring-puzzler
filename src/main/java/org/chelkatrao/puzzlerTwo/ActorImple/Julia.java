package org.chelkatrao.puzzlerTwo.ActorImple;

import org.chelkatrao.puzzlerTwo.ActorInterfaces.Actor;
import org.chelkatrao.puzzlerTwo.annotationTypeActors.Melodrama;
import org.springframework.stereotype.Component;

@Component
@Melodrama
public class Julia implements Actor {
    @Override
    public void play() {
        System.out.println("Julia");
    }
}
