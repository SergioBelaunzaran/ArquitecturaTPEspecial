package org.example.micromonopatinparada.Repository;

import org.example.tp_especial.Entities.Coordenada;
import org.example.tp_especial.Entities.Parada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ParadaRepository extends JpaRepository <Parada, Long> {

    @Query(" SELECT p FROM Parada p WHERE p.posicion = : coordenada")
    Parada checkParada (@Param("coordenada") Coordenada coordenada);
}
