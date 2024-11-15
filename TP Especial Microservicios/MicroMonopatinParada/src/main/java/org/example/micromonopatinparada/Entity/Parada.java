package org.example.micromonopatinparada.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Parada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParada;

    @Column
    private Coordenada posicion;

    //@Column
    //private List<Monopatin> monopatines;

}
