package com.deida.mutant.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class statDto {
    
    @JsonProperty("count_mutant_dna")
    private int cntMutant;
    
    @JsonProperty("count_human_dna")
    private int cntHuman;
    
    @JsonProperty("ratio")
    private double ratio;
    

    public int getCntMutant(){
        return cntMutant;
    }

    public void setCntMutant(int mutant){
        this.cntMutant = mutant;
    }

    public int getCntHuman(){
        return cntHuman;
    }

    public void SetCntHuman(int cntHuman){
        this.cntHuman = cntHuman;
    }

    public double getRatio(){
        return ratio;
    }

    public void setRatio(double ratio){
        this.ratio = ratio;
    }
}
