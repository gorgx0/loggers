package com.gorg;

import java.util.logging.Logger;

public class JulExample implements Logging {

    private final static Logger log = Logger.getLogger(JulExample.class.getName());

    @Override
    public void logging() {
        log.finest("JUL finest message");
        log.finer("JUL finer message");
        log.fine("JUL fine message");
        log.config("JUL config message");
        log.info("JUL info message");
        log.warning("JUL warning message");
        log.severe("JUL severe message");
    }

}
