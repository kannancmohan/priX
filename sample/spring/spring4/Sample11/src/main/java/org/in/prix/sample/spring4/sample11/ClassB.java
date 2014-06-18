package org.in.prix.sample.spring4.sample11;

public class ClassB {

    public ClassB() {
        System.out.println("B intialized");
    }

    public void init() {
        System.out.println("Called B's init");
    }

    public void destroy() {
        System.out.println("Called B's destroy");
    }

    public void delete() {
        System.out.println("Called B's delete");
    }

}
