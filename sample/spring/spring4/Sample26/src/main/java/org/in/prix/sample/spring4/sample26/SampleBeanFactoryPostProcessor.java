package org.in.prix.sample.spring4.sample26;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class SampleBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("    Inside postProcessBeanFactory");
        String[] beanNames = beanFactory.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("        BeanName:" + beanName);
            Class<?> beanType = beanFactory.getType(beanName);
            System.out.println("        BeanType:" + beanType);

            if (beanType == Employee.class) {
                Employee employee = new Employee();
                employee.setName("testName");
                // If we register like the following ,the bean won't call InitializingBean's afterPropertiesSet method and will not receive any destruction callbacks
                beanFactory.registerSingleton("employee", employee);
            }

        }
    }

}
