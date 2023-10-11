package com.bd2.ocorrenciasAeronauticas.service;

import com.bd2.ocorrenciasAeronauticas.model.Ocorrencia;
import com.bd2.ocorrenciasAeronauticas.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcorrenciaService {

    @Autowired
    private OcorrenciaRepository ocorrenciaRepository;


    /**
     * Salvar uma única ocorrência
     * @param novaOcorrencia
     */
    public void registrarNovaOcorrencia(Ocorrencia novaOcorrencia){
        this.ocorrenciaRepository.save(novaOcorrencia);
    }

    /**
     * Método para salvar uma lista de ocorrências
     * @param novasOcorrencias
     * @return A lista de ocorrências salvas
     */
    public List<Ocorrencia> registrarNovasOcorrencias(List<Ocorrencia> novasOcorrencias){
        try {
            return this.ocorrenciaRepository.saveAll(novasOcorrencias);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao salvar as ocorrências.", e);
        }
    }

    /**
     * Retornar todas as ocorrências com paginação
     * @param numeroPagina
     * @param tamanhoPagina
     * @return
     */
    public List<Ocorrencia> verOcorrencias(int numeroPagina, int tamanhoPagina){
        Pageable paginacao = PageRequest.of(numeroPagina, tamanhoPagina);
        Page<Ocorrencia> pagina = this.ocorrenciaRepository.findAll(paginacao);
        return pagina.getContent();
    }

    /**
     * Deletar todas as ocorrências
     */
    public void deletarTodasOcorrencias(){
        this.ocorrenciaRepository.deleteAll();
    }
}
