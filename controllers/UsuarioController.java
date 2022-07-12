package com.livecoding.live.controllers;

import com.livecoding.live.models.Usuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500/")
public class UsuarioController {

    @RequestMapping(value = "usuarios")

    public List <Usuario> getUsuarios(){
        Usuario usuario = new Usuario();

        usuario.setId(1L);
        usuario.setNombre("Elias");
        usuario.setApellido("Bianchi");
        usuario.setEmail("bianchi.elias@gmail.com");
        usuario.setPhone("099044224");

        Usuario usuario2 = new Usuario(2L, "Eddie", "Yesid", "Eddie.Yesid@gmail.com", "0546456345");
        Usuario usuario3 = new Usuario(3L, "Luciano", "Castro", "Castro.Luciano@gmail.com", "098754634");
        Usuario usuario4 = new Usuario(4L, "Jorge", "Martinez", "Martinez.Jorge@gmail.com", "098453454");

        List <Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        return usuarios;
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario(1L, "Elias", "Bianchi", "bianchi.elias@gmail.com", "099044224");
        Usuario usuario2 = new Usuario(2L, "Eddie", "Yesid", "Eddie.Yesid@gmail.com", "0546456345");
        Usuario usuario3 = new Usuario(3L, "Luciano", "Castro", "Castro.Luciano@gmail.com", "098754634");
        Usuario usuario4 = new Usuario(4L, "Jorge", "Martinez", "Martinez.Jorge@gmail.com", "098453454");

        List <Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        for(Usuario u: usuarios){
            if(u.getId().equals(id)){
                return u;
            }
        }
        return null;

    }
}
