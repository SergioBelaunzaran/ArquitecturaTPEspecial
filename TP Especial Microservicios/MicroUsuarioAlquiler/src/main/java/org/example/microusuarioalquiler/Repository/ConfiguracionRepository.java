package org.example.microusuarioalquiler.Repository;

import org.example.microusuarioalquiler.Entity.Configuracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracionRepository extends JpaRepository<Configuracion, Long> {
}

