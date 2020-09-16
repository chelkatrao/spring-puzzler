package org.chelkatrao.puzzlerTwo.Film;

import org.chelkatrao.puzzlerTwo.ActorInterfaces.Actor;
import org.chelkatrao.puzzlerTwo.annotationTypeActors.Action;
import org.chelkatrao.puzzlerTwo.annotationTypeActors.Comedy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Film {
    @Autowired
    @Comedy
    @Action
    private List<Actor> actors;
}
