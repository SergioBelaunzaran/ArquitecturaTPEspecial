package org.example.microusuarioalquiler.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Configuracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConfiguracion;

    @Column//(nullable = false)
    private float precioNormalPorMinuto;

    @Column//(nullable = false)
    private float precioMayorPorMinuto;

    @Column
    private LocalDate fechaNuevoPrecio;

    @Column
    private float precioNuevoNormalPorMinuto;

    @Column
    private float precioNuevoMayorPorMinuto;

    @Transient
    private static Configuracion instance = null;

    public static synchronized Configuracion getInstance() {
        if (instance == null) {
            instance = new Configuracion();
        }
        return instance;
    }

}
