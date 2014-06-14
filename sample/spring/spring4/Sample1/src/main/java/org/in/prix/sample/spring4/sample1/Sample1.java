package org.in.prix.sample.spring4.sample1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Sample1 {

    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        Triangle triangle = factory.getBean("triangle", Triangle.class);
        triangle.draw();

    }
}
