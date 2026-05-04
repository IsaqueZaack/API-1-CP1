package br.com.fiap.study_apir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.study_apir.model.Cliente;



@Repository
public interface TipoAnimalRepository extends JpaRepository< TipoAnimal, Long, String, String, String, int>{

}