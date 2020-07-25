package org.chelkatrao;

import java.lang.reflect.Field;

public class InjectByTypeObjectConfigurator implements ObjectConfigurator {
    @Override
    public void configure(Object t, ApplicationContext context) {
        for (Field field : t.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                try {
                    field.setAccessible(true);
                    Object object = context.getObject(field.getType());
                    field.set(t, object);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
        }
    }
}
