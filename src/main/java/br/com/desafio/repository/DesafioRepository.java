package br.com.desafio.repository;

import br.com.desafio.model.DesafioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesafioRepository extends JpaRepository<DesafioEntity, Integer> {

    DesafioEntity findByVersionAndModelAndLogic(String version, String model, Integer logic);
}
