package org.example.microusuarioalquiler.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;


import org.example.microusuarioalquiler.Entity.Configuracion;
import org.example.microusuarioalquiler.Repository.AlquilerRepository;
import org.example.microusuarioalquiler.Repository.ConfiguracionRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlquilerService {

    private final AlquilerRepository alquilerRepository;
    private final ConfiguracionRepository configuracionRepository;

    // private final ParadaService paradaService;

    @Transactional
    public Boolean setearPrecio(float precioNormal, float precioMayor){

        Configuracion configuracion = Configuracion.getInstance();
        configuracion.setPrecioNormalPorMinuto(precioNormal);
        configuracion.setPrecioMayorPorMinuto(precioMayor);

        configuracion = configuracionRepository.save(configuracion);

        return (configuracion.getPrecioNormalPorMinuto() == precioNormal &&
            configuracion.getPrecioMayorPorMinuto() == precioMayor);
    }

/*    public void finAlquiler() {

        Parada parada = new Parada();
        parada = this.checkParada(this.monopatin.getPosicion());
        if (parada != null) {

            this.finDeUso = Timestamp.valueOf(LocalDateTime.now());
            this.kmRecorrido = this.monopatin.getKmGps();
            this.monopatin.desactivarGps();
            this.calcularAlquiler();
        }
    } */

    @Transactional
    public List<?> getAllMonopatinConKm() {

        List<?> Lista = alquilerRepository.getAllMonopatinConKm();

        System.out.println("Mostrando Lista1");
        if(Lista!=null) {
            System.out.println("La no lista está vacía");
            System.out.println(Lista.size());
        }

        return Lista;
    }

/*    @Transactional
    public void calcularAlquiler() {

        (this.finDeUso.getTime() - this.inicioDeUso.getTime()) * 60000

    }*/
}
