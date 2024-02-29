package aeroauto.com.senac.controller;

import aeroauto.com.senac.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String abrirIndex() {
        return "index";
    }
}