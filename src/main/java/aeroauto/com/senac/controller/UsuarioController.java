package aeroauto.com.senac.controller;

import aeroauto.com.senac.dao.UsuarioRepository;
import aeroauto.com.senac.model.Tipo;
import aeroauto.com.senac.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/login")
    public String abrirCadUsuario(Usuario usuario){
        return "cadastro_usuario";
    }

    @PostMapping("/add_login")
    public String salvarCadUsuario(Usuario usuario){

        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();

        usuario.setTipo(Tipo.USER);

        var senha = usuario.getSenha();
        var criptografada = bc.encode(senha);
        usuario.setSenha(criptografada);

        usuarioRepository.save(usuario);

        return "redirect:/";
    }

}
