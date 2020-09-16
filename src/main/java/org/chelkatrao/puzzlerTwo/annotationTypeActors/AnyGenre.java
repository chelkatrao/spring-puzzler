package org.chelkatrao.puzzlerTwo.annotationTypeActors;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Comedy @Melodrama @Action
public @interface AnyGenre {
}
