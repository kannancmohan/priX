package org.in.prix.sample.spring4.sample12;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Country implements ApplicationContextAware {

    ApplicationContext context;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public Capital getCapital(String capitalBeanName) {
        Capital capital = context.getBean(capitalBeanName, Capital.class);
        return capital;
    }

    // Added to demonstrate the destroy behavior for singleton and prototype
    private void destroy() {
        System.out.println("Country Destroy Method Called");
    }
}
