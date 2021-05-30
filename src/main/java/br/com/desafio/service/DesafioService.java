package br.com.desafio.service;

import br.com.desafio.dto.DesafioRequestDTO;
import br.com.desafio.model.DesafioEntity;
import br.com.desafio.repository.DesafioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesafioService {

    @Autowired
    private DesafioRepository repository;

    public DesafioEntity gravarDesafio(DesafioRequestDTO dto) {
        DesafioEntity entity = new DesafioEntity();
        entity.setMxf(dto.getMxf());
        entity.setLogic(dto.getLogic());
        entity.setModel(dto.getModel());
        entity.setMxr(dto.getMxr());
        entity.setPlat(dto.getPlat());
        entity.setSerial(dto.getSerial());
        entity.setPtid(dto.getPtid());
        entity.setSam(dto.getSam());
        entity.setVerfm(dto.getVerfm());
        entity.setVersion(dto.getVersion());
        repository.save(entity);
        return entity;
    }

    public List<DesafioEntity> recuperarTodosDados() {
        return this.repository.findAll();
    }

    public DesafioEntity recuperarDadosPorParametros(String version, String model, Integer logic) {
        return this.repository.findByVersionAndModelAndLogic(version, model, logic);
    }

    public DesafioEntity alterarDados(String version, String model, Integer logic, DesafioRequestDTO dto) {
        DesafioEntity entity = this.repository.findByVersionAndModelAndLogic(version, model, logic);
        entity.setLogic(dto.getLogic());
        entity.setModel(dto.getModel());
        entity.setMxf(dto.getMxf());
        entity.setMxr(dto.getMxr());
        entity.setPlat(dto.getPlat());
        entity.setPtid(dto.getPtid());
        entity.setSerial(dto.getSerial());
        entity.setSam(dto.getSam());
        entity.setVerfm(dto.getVerfm());
        entity.setVersion(dto.getVersion());
        repository.save(entity);
        return entity;
    }
}
