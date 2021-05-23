package br.com.desafio.service;

import br.com.desafio.dto.DesafioRequestDTO;
import br.com.desafio.model.DesafioEntity;
import br.com.desafio.repository.DesafioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesafioService {

    @Autowired
    private DesafioRepository repository;

    public void gravarDesafio(DesafioRequestDTO desafioRequestDTO) {
        DesafioEntity entity = new DesafioEntity();
        entity.setMxf(desafioRequestDTO.getMxf());
        entity.setLogic(desafioRequestDTO.getLogic());
    }
}
