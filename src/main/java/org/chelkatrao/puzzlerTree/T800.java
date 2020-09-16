package org.chelkatrao.puzzlerTree;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "prototype")
public class T800 {

    @InjectOun
    Student student;

    @PostConstruct
    public void init() {
        System.out.println("Give me your clothes ");
    }

    @PreDestroy // @PreDestory annotation shunday annotatsiyaki shunday annotatsiyali method object yopilganda ishlaydi
    public void destroy() {
        System.out.println("Astalavista baby");
    }

}
