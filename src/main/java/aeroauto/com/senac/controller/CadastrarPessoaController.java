package aeroauto.com.senac.controller;

import aeroauto.com.senac.dao.UsuarioRepository;
import aeroauto.com.senac.model.Usuario;
import aeroauto.com.senac.model.Tipo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CadastrarPessoaController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/cad_pessoa")
    public String abrirCadastroPessoa(Usuario usuario ) {return "Cadastro";}

    @PostMapping("/add_usuario")
    public String addUsuario(Usuario usuario) {

        BCryptPasswordEncoder crypt = new BCryptPasswordEncoder();

        usuario.setSenha(crypt.encode(usuario.getSenha()));
        usuario.setTipo(Tipo.USER);

        usuarioRepository.save(usuario);

        return "Login";
    }
    @RestController
    @Validated
    public class UsuarioController {

        @PostMapping("/usuarios")
        public String cadastrarUsuario(@Valid @RequestBody Usuario usuario) {
            return "Usuário cadastrado com sucesso!";
        }
    }
}
