package aeroauto.com.senac.controller;

import aeroauto.com.senac.dao.CarroRepository;
import aeroauto.com.senac.model.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroRepository carroRepository;

    @GetMapping
    public String abrirCadCarro(Carro carro){
        return "catalogocarros";
    }

    @PostMapping
    public String salvarCadCarro(Carro carro){

        carro.setNomeImagem("imagens/"+carro.getNomeImagem()+".jpg");

        carroRepository.save(carro);

        return "redirect:/";
    }

}