package org.example.micromonopatinparada.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;


import org.example.micromonopatinparada.Entity.Monopatin;
import org.example.micromonopatinparada.FeignClient.AlquilerFeignClient;
import org.example.micromonopatinparada.Repository.MonopatinRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MonopatinService {

    private final MonopatinRepository monopatinRepository;

    @Autowired
    AlquilerFeignClient alquilerFeignClient;

    @Transactional
    public Monopatin insert(Monopatin monopatin) {

        try {
            final var result = monopatinRepository.save(monopatin);
            System.out.println(result);
            return result;
        }
        catch (RuntimeException e) {
            System.out.println("Entro al catch");
        }
        return null;
    }

    @Transactional
    public Boolean setearHabilitacion(Long id, boolean habilitado){
        try {
            Optional<Monopatin> monopatinOptional = monopatinRepository.findById(id);

            if (monopatinOptional.isPresent()) {
                Monopatin monopatin = monopatinOptional.get();
                System.out.println("Monopatin encontrado: " + monopatin);
                monopatin.setHabilitado(habilitado);
                final var result = this.monopatinRepository.save(monopatin);
                System.out.println("El monopatin resultante es " + result);
            }
            else {
                System.out.println("Monopatin con ID " + id + " no encontrado.");
            }

        } catch (RuntimeException e) {
            System.out.println("No se pudo setear el Monopatin");
        }
        return null;
    }

    @Transactional //( readOnly = true )
    public List<?> getAllMonopatinConKm(){

        /*List listaResultado = monopatinRepository.findAll().stream().map(Object::new )
                .collect(Collectors.toList()); */

        List<?> listaMonopatinConKm = alquilerFeignClient.getAllMonopatinConKm();

        List<?> listaMonopatinCompleta = monopatinRepository.getAllMonopatinOrdenadoPorId();


        return listaResultado;

    }

    @Transactional
    public boolean delete(Long id) {

        try {
            if (monopatinRepository.existsById(id)) {
                monopatinRepository.deleteById(id);
                return true;
            } else {
                System.out.println("El monopatin que quiere borrar no existe");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar borrar el monopatín: " + e.getMessage());
            return false;
        }
    }
}
