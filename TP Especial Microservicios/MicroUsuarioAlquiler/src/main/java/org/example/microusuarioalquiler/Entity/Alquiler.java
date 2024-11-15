package org.example.microusuarioalquiler.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlquiler;

    private Long idMonopatin;

    @ManyToOne
    @JoinColumn(name = "dniUsuario", referencedColumnName = "dniUsuario", nullable = false)
    private Usuario usuario;

    @Column
    private Timestamp inicioDeUso;

    @Column
    private Timestamp finDeUso;

    @Column
    private Timestamp inicioDePausa;

    @Column
    private Timestamp finDePausa;

    @Column
    private float kmRecorrido;

    @Column
    private float importeFactura;

    public Alquiler(Long idMonopatin, Usuario usuario) {
        this.idMonopatin = idMonopatin;
        this.usuario = usuario;
        this.inicioDeUso = Timestamp.valueOf(LocalDateTime.now());
        this.finDeUso = null;
        this.inicioDePausa = null;
        this.finDePausa = null;
        this.kmRecorrido = 0;
        //this.monopatin.activarGps();
    }

    public static void setPrecioNormal(float precioNormalPorMinuto) {
       // Alquiler.precioNormalPorMinuto = precioNormalPorMinuto;
    }

    public static void setPrecioMayor(float precioMayorPorMinuto) {
        //Alquiler.precioMayorPorMinuto = precioMayorPorMinuto;
    }

    public void setFinDeUso() {
        this.finDeUso = Timestamp.valueOf(LocalDateTime.now());
    }

    public void setInicioDePausa() {
        this.inicioDePausa = Timestamp.valueOf(LocalDateTime.now());
    }

    public void setFinDePausa() {
        this.finDePausa = Timestamp.valueOf(LocalDateTime.now());
    }


}
