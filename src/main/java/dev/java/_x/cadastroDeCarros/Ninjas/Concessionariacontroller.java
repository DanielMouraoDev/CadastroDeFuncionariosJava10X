package dev.java._x.cadastroDeCarros.Ninjas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Concessionariacontroller {

    @GetMapping("/Boasvindas")
    public String Boasvindas() {
        return "Essa é a minha primeira menssagem nessa rota";
    }
}
