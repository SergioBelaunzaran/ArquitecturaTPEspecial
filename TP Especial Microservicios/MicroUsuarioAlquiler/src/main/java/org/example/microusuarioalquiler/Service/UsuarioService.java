package org.example.microusuarioalquiler.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.example.microusuarioalquiler.Entity.Usuario;
import org.example.microusuarioalquiler.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {


    private final UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario insert(Usuario usuario) {

        try {
            if (!usuarioRepository.existsById(usuario.getDniUsuario())) {

                final var result = usuarioRepository.save(usuario);
                System.out.println(result);
                return result;
            }
            else {
                System.out.println("El alumno que quiere ingresar ya existe");
            }

        } catch (RuntimeException e) {
            System.out.println("Entro al catch");
        }
        return null;
    }

    @Transactional
    public Boolean setearHabilitacion(Long id, boolean habilitado){
        try {
            Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

            if (usuarioOptional.isPresent()) {
                Usuario usuario = usuarioOptional.get();
                System.out.println("Usuario encontrado: " + usuario);
                usuario.setHabilitado(habilitado);
                final var result = this.usuarioRepository.save(usuario);
                System.out.println("El usuario resultante es " + result);
                usuario = result;
                return (usuario.isHabilitado() == habilitado);
            }
            else {
                System.out.println("Usuario con ID " + id + " no encontrado.");
            }

        } catch (RuntimeException e) {
            System.out.println("No se pudo setear el Usuario");
        }
        return null;
    }

}
