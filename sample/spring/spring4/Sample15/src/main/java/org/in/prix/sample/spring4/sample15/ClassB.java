package org.in.prix.sample.spring4.sample15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassB {

    private static final Logger logger = LoggerFactory.getLogger(ClassB.class);

    public ClassB() {
        logger.debug("B intialized");
    }

    public void init() {
        logger.debug("Called B's init");
    }

    public void destroy() {
        logger.debug("Called B's destroy");
    }

    public void delete() {
        logger.info("Called B's delete");
    }

}
