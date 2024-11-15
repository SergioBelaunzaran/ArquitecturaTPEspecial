package org.example.microusuarioalquiler.Controller;

import lombok.RequiredArgsConstructor;


import org.example.microusuarioalquiler.Service.AlquilerService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/alquiler")
public class AlquilerController {

    private AlquilerService alquilerService;

    @PutMapping("/setearPrecio/{precioNormal}/{precioMayor}")
    public Boolean setearHabilitado(@PathVariable float precioNormal, @PathVariable float precioMayor){
        return true; //this.alquilerService.setearPrecio(precioNormal, precioMayor);
    }

    @GetMapping("reporteKm")
    public List<?> getAllMonopatinConKm(){
        return new ArrayList<>(); /*alquilerService.getAllMonopatinConKm();*/

    }
}
