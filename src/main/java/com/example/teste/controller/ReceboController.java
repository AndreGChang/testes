package com.example.teste.controller;

import com.example.teste.DTO.Recebo;
import com.example.teste.entity.Mostrar;
import com.example.teste.service.ReceboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api")
public class ReceboController {

    @Autowired
    private ReceboService receboService;

    private Mostrar mostrar;


    @PostMapping("/send")
    public ResponseEntity<?> mandar(@RequestBody Recebo recebo){
        try{
            mostrar = this.receboService.verify(recebo);
            System.out.println(recebo.getNumeroList());
            return ResponseEntity.ok(mostrar);
        }catch (Exception error){
            return ResponseEntity.badRequest().body("Error" + error.getMessage());
        }

    }
}

