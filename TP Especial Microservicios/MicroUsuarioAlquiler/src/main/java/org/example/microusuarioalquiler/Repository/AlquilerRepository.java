package org.example.microusuarioalquiler.Repository;

import org.example.microusuarioalquiler.Entity.Alquiler;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerRepository extends JpaRepository<Alquiler, Long> {

    //@Query("SELECT a.id_monopatin, SUM(a.km_recorrido) FROM Alquiler a GROUP BY a.id_monopatin ORDER BY a.id_monopatin")
    @Query("SELECT a FROM Alquiler a")
    public List<Alquiler> getAllMonopatinConKm();
}
