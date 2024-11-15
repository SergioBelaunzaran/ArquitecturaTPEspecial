package org.example.micromonopatinparada.Controller;

import lombok.RequiredArgsConstructor;
import org.example.micromonopatinparada.Entity.Monopatin;
import org.example.micromonopatinparada.Service.MonopatinService;
import org.hibernate.mapping.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/monopatin")
public class MonopatinController {

    private final MonopatinService monopatinService;

    @PostMapping("")
    public ResponseEntity<?> insert(@RequestBody Monopatin monopatin){

        try{
            System.out.println("Entro al try");
            return ResponseEntity.status(HttpStatus.OK).body(monopatinService.insert(monopatin));
        }catch (Exception e){
            System.out.println("Entro al catch");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. No se pudo ingresar, revise los campos e intente nuevamente.\"}");
        }
    }

    @PutMapping("/Habilitacion/{id}/{habilitado}")
    public Boolean setearHabilitacion(@PathVariable Long id, @PathVariable boolean habilitado){
        return this.monopatinService.setearHabilitacion(id, habilitado);
    }

    @GetMapping("/reporteKm/")
    public List reportePorKm(){
        return this.monopatinService.getAllMonopatinConKm();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try{
            System.out.println("Id: " +id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(monopatinService.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. No se pudo eliminar intente nuevamente.\"}");
        }
    }

/*
    public boolean alquilar() {

        if (this.saldo > 0) {

            Alquiler alquiler = new Alquiler(this.leerQrMonopatin(),this);

            return true;
        }
        return false;
    }

    private Monopatin leerQrMonopatin() {

        Monopatin monopatin = new Monopatin(); // Simula el monopatin que le devolveria su lector de QR
        return monopatin;
    } */
}
