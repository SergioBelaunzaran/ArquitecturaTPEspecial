package org.example.micromonopatinparada.FeignClient;

import org.example.microusuarioalquiler.Entity.Alquiler;
import org.hibernate.mapping.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="microAlquiler")
public interface AlquilerFeignClient {

    @GetMapping("reporteKm")
    List getAllMonopatinConKm();

        /*@GetMapping("api/estudiantes/dni/{dni}")
        Estudiante getEstudianteByDni(@PathVariable int dni);

    import com.example.microinscripcion.model.Carrera;
    import com.example.microinscripcion.model.Estudiante;
    import org.springframework.cloud.openfeign.FeignClient;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;

            @FeignClient(name="microestudiante")
            public interface EstudianteFeignClient {

                @GetMapping("api/estudianteslu/{lu}")
                Estudiante getEstudianteByLu(@PathVariable int lu);

                @GetMapping("api/estudiantes/dni/{dni}")
                Estudiante getEstudianteByDni(@PathVariable int dni); */

        }
}
