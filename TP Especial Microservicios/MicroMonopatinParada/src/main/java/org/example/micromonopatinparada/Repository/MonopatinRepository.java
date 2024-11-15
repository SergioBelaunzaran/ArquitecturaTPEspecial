package org.example.micromonopatinparada.Repository;


import org.example.micromonopatinparada.Entity.Monopatin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface MonopatinRepository extends JpaRepository<Monopatin, Long> {

    @Query("SELECT m FROM Monopatin m ORDER BY m.idMonopatin")
    public List<?> getAllMonopatinOrdenadoPorId();
}
