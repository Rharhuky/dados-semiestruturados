package com.bd2.ocorrenciasAeronauticas.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.lang.reflect.Field;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "ocorrencias")
public class Ocorrencia implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Numero_da_Ocorrencia")
    private String Numero_da_Ocorrencia;

    @Column(name = "Numero_da_Ficha")
    private String Numero_da_Ficha;

    @Column(name = "Operador_Padronizado")
    private String Operador_Padronizado;

    @Column(name = "Classificacao_da_Ocorrencia")
    private String Classificacao_da_Ocorrência;

    @Column(name = "Data_da_Ocorrencia")
    private String Data_da_Ocorrencia;

    @Column(name = "Hora_da_Ocorrencia")
    private String Hora_da_Ocorrencia;

    @Column(name = "Municipio")
    private String Municipio;

    @Column(name = "UF")
    private String UF;

    @Column(name = "Regiao")
    private String Regiao;

    @Column(name = "Descricao_do_Tipo")
    private String Descricao_do_Tipo;

    @Column(name = "ICAO")
    private String ICAO;

    @Column(name = "Latitude")
    private String Latitude;

    @Column(name = "Longitude")
    private String Longitude;

    @Column(name = "Tipo_de_Aerodromo")
    private String Tipo_de_Aerodromo;

    @Column(name = "Historico", length = 4000)
    private String Historico;

    @Column(name = "Matricula")
    private String Matricula;

    @Column(name = "Categoria_da_Aeronave")
    private String Categoria_da_Aeronave;

    @Column(name = "Operador")
    private String Operador;

    @Column(name = "Tipo_de_Ocorrencia")
    private String Tipo_de_Ocorrencia;

    @Column(name = "Fase_da_Operacao")
    private String Fase_da_Operacao;

    @Column(name = "Operacao")
    private String Operacao;

    @Column(name = "Danos_a_Aeronave")
    private String Danos_a_Aeronave;

    @Column(name = "Aerodromo_de_Destino")
    private String Aerodromo_de_Destino;

    @Column(name = "Aerodromo_de_Origem")
    private String Aerodromo_de_Origem;

    @Column(name = "Lesoes_Fatais_Tripulantes")
    private String Lesoes_Fatais_Tripulantes;

    @Column(name = "Lesoes_Fatais_Passageiros")
    private String Lesoes_Fatais_Passageiros;

    @Column(name = "Lesoes_Fatais_Terceiros")
    private String Lesoes_Fatais_Terceiros;

    @Column(name = "Lesoes_Graves_Tripulantes")
    private String Lesoes_Graves_Tripulantes;

    @Column(name = "Lesoes_Graves_Passageiros")
    private String Lesoes_Graves_Passageiros;

    @Column(name = "Lesoes_Graves_Terceiros")
    private String Lesoes_Graves_Terceiros;

    @Column(name = "Lesoes_Leves_Tripulantes")
    private String Lesoes_Leves_Tripulantes;

    @Column(name = "Lesoes_Leves_Passageiros")
    private String Lesoes_Leves_Passageiros;

    @Column(name = "Lesoes_Leves_Terceiros")
    private String Lesoes_Leves_Terceiros;

    @Column(name = "Ilesos_Tripulantes")
    private String Ilesos_Tripulantes;

    @Column(name = "Ilesos_Passageiros")
    private String Ilesos_Passageiros;

    @Column(name = "Lesoes_Desconhecidas_Tripulantes")
    private String Lesoes_Desconhecidas_Tripulantes;

    @Column(name = "Lesoes_Desconhecidas_Passageiros")
    private String Lesoes_Desconhecidas_Passageiros;

    @Column(name = "Lesoes_Desconhecidas_Terceiros")
    private String Lesoes_Desconhecidas_Terceiros;

    @Column(name = "Modelo")
    private String Modelo;

    @Column(name = "CLS")
    private String CLS;

    @Column(name = "Tipo_ICAO")
    private String Tipo_ICAO;

    @Column(name = "PMD")
    private String PMD;

    @Column(name = "Numero_de_Assentos")
    private String Numero_de_Assentos;

    @Column(name = "Nome_do_Fabricante")
    private String Nome_do_Fabricante;

    @Column(name = "PSSO")
    private String PSSO;

    public void tratarCampos(){
        Field[] fields = getClass().getDeclaredFields();
        for (Field field : fields){
            if(field.getName().equals("id") || field.getName().equals("serialVersionUID"))
                continue;
            try{
                if(field.get(this) == null || field.get(this).toString().trim().equals(""))
                    field.set(this, "nao informado");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}

