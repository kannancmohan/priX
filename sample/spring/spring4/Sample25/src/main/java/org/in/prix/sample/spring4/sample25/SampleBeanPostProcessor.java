package org.in.prix.sample.spring4.sample25;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SampleBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("    Inside Before Initialization  BeanName : " + beanName + " created : " + bean.toString());
        // make some changes to bean or even change the retur type
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("    Inside After Initialization  BeanName : " + beanName + " created : " + bean.toString());
        return bean;
    }

}
