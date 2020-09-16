package org.chelkatrao.puzzlerFour;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class IntegerFactory implements FactoryBean<String> {

    @Override
    public String getObject() throws Exception {
        return "Ashraf";
    }

    @Override
    public Class<?> getObjectType() {
        return String.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
