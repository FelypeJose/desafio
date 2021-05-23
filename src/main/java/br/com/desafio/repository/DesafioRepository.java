package br.com.desafio.repository;

import br.com.desafio.model.DesafioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesafioRepository extends CrudRepository<DesafioEntity, Integer> {}
