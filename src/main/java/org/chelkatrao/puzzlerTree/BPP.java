package org.chelkatrao.puzzlerTree;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Component
public class BPP implements BeanPostProcessor {

    @Autowired
    private ConfigurableListableBeanFactory factory;

    // ConfigurableListableBeanFactory interface-i
    // yordamida biz BeanDefinition larni listini olishimiz mumkun
    @SneakyThrows
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) factory.getBeanDefinition(beanName);
        if (beanDefinition.isPrototype()) {
            if (beanDefinition.getDestroyMethodName() != null) {
                printWarning();
                return bean;
            }
            Method[] methods = bean.getClass().getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(PreDestroy.class)) {
                    printWarning();
                }
            }
        }
        return bean;
    }

    private void printWarning() {
        System.out.println(" [WARNING] : TENTAKMISAN");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
