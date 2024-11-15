package org.example.microusuarioalquiler;

import jakarta.annotation.PostConstruct;
import org.example.microusuarioalquiler.Entity.Usuario;
import org.example.microusuarioalquiler.Repository.AlquilerRepository;
import org.example.microusuarioalquiler.Repository.UsuarioAsociadoRepository;
import org.example.microusuarioalquiler.Repository.UsuarioRepository;
import org.example.microusuarioalquiler.Service.AlquilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class MicroUsuarioAlquilerApplication {

    @Autowired
    private AlquilerService alquilerService;

    public static void main(String[] args) {
        SpringApplication.run(MicroUsuarioAlquilerApplication.class, args);

        System.out.println("Mostrando Lista2");
    }

    @PostConstruct
    public void init() {
        alquilerService.getAllMonopatinConKm();
        System.out.println("Mostrando Lista3");
    }

}
