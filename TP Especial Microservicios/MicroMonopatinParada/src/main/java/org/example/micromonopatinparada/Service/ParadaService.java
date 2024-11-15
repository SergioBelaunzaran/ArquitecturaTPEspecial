package org.example.micromonopatinparada.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.micromonopatinparada.Entity.Parada;
import org.example.micromonopatinparada.Repository.ParadaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParadaService {


    private final ParadaRepository paradaRepository;

    @Transactional
    public Parada insert(Parada parada) {

        try {
            final var result = paradaRepository.save(parada);
            System.out.println(result);
            return result;
        }
        catch (RuntimeException e) {
            System.out.println("Entro al catch");
        }
        return null;
    }

    @Transactional
    public boolean delete(Long id) {

        try {
            if (paradaRepository.existsById(id)) {
                paradaRepository.deleteById(id);
                return true;
            } else {
                System.out.println("La Parada que quiere borrar no existe");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar borrar la Parada: " + e.getMessage());
            return false;
        }
    }

    public Parada checkParada(Coordenada coordenada) {

        return paradaRepository.checkParada(coordenada);

    }
}
