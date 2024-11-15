package org.example.micromonopatinparada.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.micromonopatinparada.Entity.Monopatin;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class MonopatinConKmResponseDTO {

    private Monopatin monopatin;
    private float km;
}
