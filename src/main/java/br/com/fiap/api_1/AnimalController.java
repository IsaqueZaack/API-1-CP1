package br.com.fiap.api_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @GetMapping("/animais")
    public String listarAnimais() {
        return "Lista de animais: Cachorro, Gato, Leão";
    }

    @GetMapping("/animais/destaque")
    public String animalDestaque() {
        return "Animal destaque da semana: Leão";
    }

}