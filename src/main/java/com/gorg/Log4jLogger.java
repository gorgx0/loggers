package com.gorg;

import org.apache.log4j.Logger;

public class Log4jLogger implements Logging {

    private final static Logger log = Logger.getLogger(Log4jLogger.class);

    @Override
    public void logging() {

        log.trace("LOG4J trace tracce message");
        log.debug("LOG4J debug tracce message");
        log.info("LOG4J info tracce message");
        log.warn("LOG4J warn tracce message");
        log.error("LOG4J error tracce message");
        log.fatal("LOG4J fatal tracce message");

    }
}
