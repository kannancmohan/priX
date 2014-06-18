package org.in.prix.sample.spring4.sample11;

public class ClassA {

    public ClassA() {
        System.out.println("A intialized");
    }

    private void init() {
        System.out.println("Called A's init");
    }

    private void destroy() {
        System.out.println("Called A's destroy");
    }
}
