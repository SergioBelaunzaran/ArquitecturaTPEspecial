package org.example.microusuarioalquiler.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Usuario {

    @Id
    private Long dniUsuario;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String eMail;

    @Column(nullable = false)
    private int celular;

    @Column(nullable = false)
    private LocalDate fechaDeAlta;

    @Column(nullable = false)
    private float saldo = 0;

    @Column(nullable = false)
    private boolean habilitado = true;

    public Usuario(Long dniUsuario, String nombre, String apellido, String eMail, int celular) {
        this.dniUsuario = dniUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.eMail = eMail;
        this.celular = celular;
        this.fechaDeAlta = LocalDate.now();
    }


}
