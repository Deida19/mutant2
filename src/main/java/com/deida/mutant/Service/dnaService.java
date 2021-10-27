package com.deida.mutant.Service;

import com.deida.mutant.Repository.dnaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.deida.mutant.DTO.statDto;
import com.deida.mutant.Model.*;
import com.deida.mutant.Mutante.*;

@Service
public class dnaService {
    @Autowired
    dnaRepository dnaRepository;

    public boolean guardarDna(List<String> dna){
        IMutante mut = new mutante();
        boolean resp = mut.esMutante(dna);
        dnaModel dnaModel2 = new dnaModel();
        dnaModel2.setMutante(resp);
        dnaRepository.save(dnaModel2);
        return resp;
    }

    public statDto obtenerDna(){
        ArrayList<dnaModel> arrDna = null;
        int cntMutant = 0;
        int cntHuman = 0;
        double ratio = 0;
        statDto statDto = new statDto();
        arrDna = (ArrayList<dnaModel>) dnaRepository.findAll();
        for(int i = 0; i < arrDna.size(); i++){
            if(arrDna.get(i).getMutante()){
                cntMutant = cntMutant + 1;
            }else{
                cntHuman = cntHuman + 1;
            }
        }
        if(cntHuman == 0){
            ratio = 0;
        }else{
            ratio = cntMutant / cntHuman;
        }
        statDto.setCntMutant(cntMutant);
        statDto.SetCntHuman(cntHuman);
        statDto.setRatio(ratio);
        return statDto;

    }
}
