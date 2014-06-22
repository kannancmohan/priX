package org.in.prix.sample.spring4.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassA {

    private static final Logger logger = LoggerFactory.getLogger(ClassA.class);

    public ClassA() {
        logger.debug("A intialized");
    }

    private void init() {
        logger.debug("Called A's init");
    }

    private void destroy() {
        logger.debug("Called A's destroy");
    }
}
