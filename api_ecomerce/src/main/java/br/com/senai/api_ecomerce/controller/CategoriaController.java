package br.com.senai.api_ecomerce.controller;

import br.com.senai.api_ecomerce.categoria.DadosCadastroCategoria;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

    @PostMapping
    public String cadastrarCategoria(@RequestBody DadosCadastroCategoria dados) {
        return "Categoria cadastrada com sucesso";
    }

}
