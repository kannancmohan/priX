package org.in.prix.sample.spring4.sample24;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class BeanWithAwareCallBacks implements ApplicationContextAware, BeanNameAware, ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware, MessageSourceAware, ResourceLoaderAware {

    private String                    name;
    private ApplicationContext        applicationContext;
    private ApplicationEventPublisher applicationEventPublisher;
    private ClassLoader               classLoader;
    private BeanFactory               beanFactory;
    private MessageSource             messageSource;
    private ResourceLoader            resourceLoader;

    public void setName(String name) {
        this.name = name;
    }

    public void setBeanName(String name) {
        System.out.println("    Inside BeanNameAware.setBeanName  beanname:" + name);

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("    Inside ApplicationContextAware.setApplicationContext");
        this.applicationContext = applicationContext;
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("    Inside ApplicationEventPublisherAware.setApplicationEventPublisher");
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("    Inside BeanClassLoaderAware.setBeanClassLoader");
        this.classLoader = classLoader;

    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("    Inside BeanFactoryAware.setBeanFactory");
        this.beanFactory = beanFactory;

    }

    public void setMessageSource(MessageSource messageSource) {
        System.out.println("    Inside MessageSourceAware.setMessageSource");
        this.messageSource = messageSource;

    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println("    Inside ResourceLoaderAware.setResourceLoader");
        this.resourceLoader = resourceLoader;
    }

}
