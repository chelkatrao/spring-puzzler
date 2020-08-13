package org.puzzlers;

import org.springframework.stereotype.Component;

@Component
public class AuditManager {
    public Object audit(Object o) {
        System.out.println("*************************************calculated some process**************************************");
        return o;
    }
}
