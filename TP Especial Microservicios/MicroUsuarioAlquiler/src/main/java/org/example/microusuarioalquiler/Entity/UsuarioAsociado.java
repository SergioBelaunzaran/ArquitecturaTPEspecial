package org.example.microusuarioalquiler.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class UsuarioAsociado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuarioAsociado;

    @ManyToOne
    @JoinColumn(name = "dniUsuario", referencedColumnName = "dniUsuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "dniAsociado", referencedColumnName = "dniUsuario", nullable = false)
    private Usuario asociado;

}
