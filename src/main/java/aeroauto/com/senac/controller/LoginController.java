package aeroauto.com.senac.controller;

import aeroauto.com.senac.dao.UsuarioRepository;
import aeroauto.com.senac.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository pessoaRepository;

    @PostMapping("/login")
    public String login(LoginDTO loginDTO) {

        return "Index";
    }

    @GetMapping("/entrar")
    public String getLoginPage() {
        return "Login";

    }

    @GetMapping("/login-sucess")

    public String loginsucess() {

        return "index";
    }

}
