package com.bd2.ocorrenciasAeronauticas.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 */
@Component
public class Startup {

    /**
     * Start
     */
    private Documento documento;

    @Autowired
    public Startup(Documento documento) {
        this.documento = documento;
    }

   public void start() {
        documento.selecionarQuantiaRegistros(100);
    }

}
