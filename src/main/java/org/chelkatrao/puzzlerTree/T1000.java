package org.chelkatrao.puzzlerTree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")//Springda @Scope annotation yozilmasa by default singleton bean yaratadi
public class T1000 {

    @Autowired
    private T800 t800;

    @PostConstruct
    public void init(){
        System.out.println("Where is John Connor");
    }

    @PreDestroy// destroy method qachonki object yopilishidan olding ishlaydigan method
    public void destroy(){
        System.out.println("Strashni zvuk");
    }

}
