package org.in.prix.sample.spring4.sample22;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ClassA implements InitializingBean, DisposableBean {

    public void destroy() throws Exception {
        System.out.println("Inside destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertiesSet");
    }

}
