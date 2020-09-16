package org.chelkatrao.puzzlerOne;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;

@Component
public class InitMethodRegistryBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] names = beanFactory.getBeanDefinitionNames();
        for (String name : names) {
            AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition(name);
            String beanClassName = beanDefinition.getBeanClassName();
            if (beanClassName == null)
                continue;
            try {
                Class<?> beanClass = Class.forName(beanClassName);
                Class<?>[] allInterfacesForClass = ClassUtils.getAllInterfacesForClass(beanClass);
                for (Class<?> ifc : allInterfacesForClass) {
                    Method[] methods = ifc.getMethods();
                    for (Method method : methods) {
                        if (method.isAnnotationPresent(PostConstruct.class)) {
                            beanDefinition.setInitMethodName(method.getName());
                        }
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
