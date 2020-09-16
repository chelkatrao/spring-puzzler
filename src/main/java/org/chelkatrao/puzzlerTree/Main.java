package org.chelkatrao.puzzlerTree;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.chelkatrao.puzzlerTree");
        context.close();
    }
}
