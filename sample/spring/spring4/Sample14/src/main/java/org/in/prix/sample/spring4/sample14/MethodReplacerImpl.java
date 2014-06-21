package org.in.prix.sample.spring4.sample14;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MethodReplacerImpl implements MethodReplacer {

    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        String fomatter = (String) args[0];
        return new CurrentDateTime(fomatter);
    }

}
