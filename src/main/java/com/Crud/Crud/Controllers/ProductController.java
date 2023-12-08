package com.Crud.Crud.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//para identificar que essa classe e uma controller
@Controller
//request mapping fala para o cliente qual e o endpoint
//Especifica a URL que um método do controlador irá manipular
@RequestMapping("/h2-console")
public class ProductController {

    //essa anotação identifica qual o tipo de requisição vai ser chamada no endpoint
    @GetMapping
    public ResponseEntity getAllProduct(){
        return ResponseEntity.ok("Deu certo");
    }
}
