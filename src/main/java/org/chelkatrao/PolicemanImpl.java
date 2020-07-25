package org.chelkatrao;

import javax.annotation.PostConstruct;

public class PolicemanImpl implements Policeman {

    @InjectByType
    private Recommender recommend;

    @PostConstruct
    public void PolicemanImpl() {
        System.out.println(recommend.getClass());
    }

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println(recommend.getClass());
        System.out.println("pish bax , bax bax , kish kish");
    }
}
