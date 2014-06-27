package org.in.prix.sample.spring4.sample21;

import org.springframework.context.SmartLifecycle;

/**
 * Class to start and stop backend process within a bean when applicationContext itself starts or stops
 * 
 */
public class Customer implements SmartLifecycle {

    boolean isRunning = false;

    public void start() {
        // TODO load some background process
        System.out.println("Inside start");
        isRunning = true;
    }

    public void stop() {
        // TODO release the loaded background process
        System.out.println("Inside stop");
        isRunning = false;
    }

    public boolean isRunning() {
        System.out.println("Inside isRunning");
        return isRunning;
    }

    /* 
     * During context start/stop, the objects with the lowest phase start first, and when stopping, the reverse order is followed
     * Default phase is 0
     */
    public int getPhase() {
        System.out.println("Inside getPhase");
        return 0;
    }

    public boolean isAutoStartup() {
        System.out.println("Inside isAutoStartup");
        return true;
    }

    public void stop(Runnable callback) {
        System.out.println("Inside stop with arg");
        stop();
        callback.run();
    }
}
