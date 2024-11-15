package org.example.micromonopatinparada.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Monopatin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMonopatin;

    @ManyToOne
    @JoinColumn(name = "idParada", referencedColumnName = "idParada")
    private Parada parada = null;

    @Column(nullable = false)
    private boolean habilitado = false;

    @Column(nullable = false)
    private boolean enUso = false;

    @Column
    private LocalDate fechaUltimoMantenimiento;


    public void activarGps() {

    }

    /*public float desactivarGps() {
        return ;
    } */
}
