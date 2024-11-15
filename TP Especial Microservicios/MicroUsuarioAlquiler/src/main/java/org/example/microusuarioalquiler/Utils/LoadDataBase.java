package org.example.microusuarioalquiler.Utils;

import lombok.extern.slf4j.Slf4j;

import org.example.microusuarioalquiler.Entity.Alquiler;
import org.example.microusuarioalquiler.Entity.Usuario;
import org.example.microusuarioalquiler.Entity.UsuarioAsociado;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.example.microusuarioalquiler.Repository.*;

@Configuration
@Slf4j
public class LoadDataBase {

    private Alquiler alquiler1, alquiler2, alquiler3, alquiler4, alquiler5, alquiler6, alquiler7, alquiler8, alquiler9, alquiler10;
    private Usuario usuario1, usuario2, usuario3, usuario4, usuario5, usuario6, usuario7, usuario8, usuario9, usuario10;
    private UsuarioAsociado usuarioAsociado1, usuarioAsociado2, usuarioAsociado3, usuarioAsociado4, usuarioAsociado5;



    @Bean
    CommandLineRunner initDatabase(@Qualifier("alquilerRepository") AlquilerRepository alquilerRepository,
                                   @Qualifier("usuarioRepository") UsuarioRepository usuarioRepository,
                                   @Qualifier("usuarioAsociadoRepository") UsuarioAsociadoRepository usuarioAsociadoRepository) {
        return args -> {

            Usuario usuario1 = new Usuario(12345678L, "Juan", "Pérez", "juan.perez@example.com", 5551234);
            Usuario usuario2 = new Usuario(87654321L, "María", "González", "maria.gonzalez@example.com", 5555678);
            Usuario usuario3 = new Usuario(23456789L, "Carlos", "Ramírez", "carlos.ramirez@example.com", 5559876);
            Usuario usuario4 = new Usuario(98765432L, "Ana", "Martínez", "ana.martinez@example.com", 5554321);
            Usuario usuario5 = new Usuario(34567890L, "Luis", "Gómez", "luis.gomez@example.com", 5558765);
            Usuario usuario6 = new Usuario(45678901L, "Sofía", "López", "sofia.lopez@example.com", 5553456);
            Usuario usuario7 = new Usuario(56789012L, "Jorge", "Hernández", "jorge.hernandez@example.com", 5556789);
            Usuario usuario8 = new Usuario(67890123L, "Laura", "Jiménez", "laura.jimenez@example.com", 5557890);
            Usuario usuario9 = new Usuario(78901234L, "Ricardo", "Vargas", "ricardo.vargas@example.com", 5554567);
            Usuario usuario10 = new Usuario(89012345L, "Elena", "Castro", "elena.castro@example.com", 5552345);

            log.info("Preloading " + usuarioRepository.save(usuario1));
            log.info("Preloading " + usuarioRepository.save(usuario2));
            log.info("Preloading " + usuarioRepository.save(usuario3));
            log.info("Preloading " + usuarioRepository.save(usuario4));
            log.info("Preloading " + usuarioRepository.save(usuario5));
            log.info("Preloading " + usuarioRepository.save(usuario6));
            log.info("Preloading " + usuarioRepository.save(usuario7));
            log.info("Preloading " + usuarioRepository.save(usuario8));
            log.info("Preloading " + usuarioRepository.save(usuario9));
            log.info("Preloading " + usuarioRepository.save(usuario10));

            Alquiler alquiler1 = new Alquiler(1L, usuario1);
            Alquiler alquiler2 = new Alquiler(2L, usuario2);
            Alquiler alquiler3 = new Alquiler(3L, usuario3);
            Alquiler alquiler4 = new Alquiler(4L, usuario4);
            Alquiler alquiler5 = new Alquiler(5L, usuario5);
            Alquiler alquiler6 = new Alquiler(6L, usuario6);
            Alquiler alquiler7 = new Alquiler(7L, usuario7);
            Alquiler alquiler8 = new Alquiler(8L, usuario8);
            Alquiler alquiler9 = new Alquiler(9L, usuario9);
            Alquiler alquiler10 = new Alquiler(10L, usuario10);

            log.info("Preloading " + alquilerRepository.save(alquiler1));
            log.info("Preloading " + alquilerRepository.save(alquiler2));
            log.info("Preloading " + alquilerRepository.save(alquiler3));
            log.info("Preloading " + alquilerRepository.save(alquiler4));
            log.info("Preloading " + alquilerRepository.save(alquiler5));
            log.info("Preloading " + alquilerRepository.save(alquiler6));
            log.info("Preloading " + alquilerRepository.save(alquiler7));
            log.info("Preloading " + alquilerRepository.save(alquiler8));
            log.info("Preloading " + alquilerRepository.save(alquiler9));
            log.info("Preloading " + alquilerRepository.save(alquiler10));

        };


    }
}
