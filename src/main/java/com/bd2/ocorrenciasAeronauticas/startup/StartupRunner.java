package com.bd2.ocorrenciasAeronauticas.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private Startup startup;

    @Override
    public void run(String... args) throws Exception {
        startup.start();
    }
}
