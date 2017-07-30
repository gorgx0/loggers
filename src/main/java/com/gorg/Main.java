package com.gorg;

import sun.rmi.runtime.Log;

import java.util.logging.LogManager;

public class Main {

    public static void main(String[] args) {
        Logging julExample = new JulExample();
        julExample.logging();

        Logging log4j = new Log4jLogger();
        log4j.logging();

        Logging slf4j = new Slf4jLogger();
        slf4j.logging();
    }

}
