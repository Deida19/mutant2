package com.deida.mutant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deida.mutant.DTO.*;
import com.deida.mutant.Service.*;

@RestController
@RequestMapping("/")
public class dnaController {
    @Autowired
    dnaService dnaServicio;

    @PostMapping("mutant/")
    public HttpStatus validarMutante(@RequestBody dnaDto dna){
  
        if (this.dnaServicio.guardarDna(dna.getDna()) == true){
            return HttpStatus.OK;
                
        }else{
            return HttpStatus.FORBIDDEN;
        }
        
    }

    @GetMapping("stats/")
    public statDto verificarAdn(){
        return this.dnaServicio.obtenerDna();
    }
}
