package com.nttdata.afiliaciones.repository;

import com.nttdata.afiliaciones.entity.Afiliaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfiliacionesRepository extends JpaRepository<Afiliaciones, Integer> {
    // aqui podrian ir los querys para obtener la data

}
