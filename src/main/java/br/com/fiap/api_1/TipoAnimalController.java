package br.com.fiap.api_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipoAnimalController {

    @GetMapping("/tipos")
    public String tiposAnimais() {
        return "Tipos de animais: Mamíferos, Répteis, Aves";
    }

}