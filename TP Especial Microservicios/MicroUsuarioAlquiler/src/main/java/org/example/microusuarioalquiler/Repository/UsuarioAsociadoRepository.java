package org.example.microusuarioalquiler.Repository;

import org.example.microusuarioalquiler.Entity.UsuarioAsociado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioAsociadoRepository extends JpaRepository<UsuarioAsociado, Long> {
}
