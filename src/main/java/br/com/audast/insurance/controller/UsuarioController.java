package br.com.audast.insurance.controller;

import br.com.audast.insurance.domain.UsuarioModel;
import br.com.audast.insurance.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public void imprimirNomesUsuarios() {
        List<UsuarioModel> usuarios = usuarioService.listarUsuarios();
        usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
    }

    @PostMapping
    public ResponseEntity<UsuarioModel> criarUsuario(@RequestBody UsuarioModel usuario) {
        UsuarioModel novoUsuario = usuarioService.criarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
    }
}