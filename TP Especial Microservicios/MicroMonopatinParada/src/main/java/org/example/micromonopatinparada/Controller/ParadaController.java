package org.example.micromonopatinparada.Controller;

import lombok.RequiredArgsConstructor;
import org.example.tp_especial.Entities.Parada;
import org.example.tp_especial.Service.ParadaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/parada")
public class ParadaController {

    private final ParadaService paradaService;

    @PostMapping("")
    public ResponseEntity<?> insert(@RequestBody Parada parada){

        try{
            System.out.println("Entro al try");
            return ResponseEntity.status(HttpStatus.OK).body(paradaService.insert(parada));
        }catch (Exception e){
            System.out.println("Entro al catch");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. No se pudo ingresar, revise los campos e intente nuevamente.\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            System.out.println("Id: " +id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(paradaService.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. No se pudo eliminar intente nuevamente.\"}");
        }
    }

}
