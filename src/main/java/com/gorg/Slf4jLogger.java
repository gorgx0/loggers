package com.gorg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLogger implements Logging {

    private final static Logger log = LoggerFactory.getLogger(Slf4jLogger.class);

    @Override
    public void logging() {
        log.error("Slf4j - error message");
        log.warn("Slf4j - warn message");
        log.info("Slf4j - info message");
        log.debug("Slf4j - debug message");
        log.trace("Slf4j - trace message");
    }
}
