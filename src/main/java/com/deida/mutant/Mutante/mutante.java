package com.deida.mutant.Mutante;

import java.util.List;

public class mutante implements IMutante{

    public boolean resp = false;

    @Override
    public boolean esMutante(List<String> dna){
        boolean valid = false;
        boolean validMutan = false;
        valid = validarEntrada(dna);
        if (valid == false){
            validMutan = validarMutante(dna);
        }
                
        return validMutan;
    }
    
    public boolean validarEntrada(List<String> entrada){
        String cadena;
        boolean error = false;
        for (int i = 0; i < entrada.size(); i++){
            cadena = entrada.get(i);
            cadena = cadena.toUpperCase();
            for (int k = 0; k < cadena.length(); k++){
                if (cadena.charAt(k) != 'A' && cadena.charAt(k) != 'T' && cadena.charAt(k) != 'C' && cadena.charAt(k) != 'G' ){ 
                    error = true;
                }
            }
        }
        return error;
    }
    
    public boolean validarMutante(List<String> dna2){
        int dimensionX = dna2.size();
        int dimensionY = dna2.get(0).length();
        
        String[][] dnaArray = new String[dimensionX][dimensionY];
        for (int i = 0; i < dna2.size(); i++){
            for(int j = 0; j < dna2.get(i).length(); j++){
                dnaArray[i][j] = String.valueOf(dna2.get(i).charAt(j));
            }
        }
        
        String chrActual;
        for(int i = 0; i < dimensionX; i++){
            for(int j = 0; j < dimensionY; j++){
                chrActual = dnaArray[i][j];
                recorrerVector(chrActual, i, j+1, dimensionY, dnaArray, "h");
                recorrerVector(chrActual, i, j+1, dimensionY, dnaArray, "d");
            }
        }
        
        for(int i = 0; i < dimensionX; i++){
            for(int j = 0; j < dimensionY; j++){
                chrActual = dnaArray[i][j];
                recorrerVector(chrActual, j, i+1, dimensionY, dnaArray, "v");
            }
        }
        
       
         return resp;      
    }
    
    public int recorrerVector(String chrActual, int fActual, int cInicial, int cantRecorrer, String[][] v1, String direccion){
        int cont = 0;
        for(int ii = cInicial; ii < cantRecorrer; ii++){
            switch(direccion){
                case "h":
                    if(chrActual.equals(v1[fActual][ii])){
                        cont = cont + 1;
                    }else{
                        cont = 0;
                    }
                    break;
                case "v":
                    if(chrActual.equals(v1[ii][fActual])){
                        cont = cont + 1;
                    }else{
                        cont = 0;
                    }
                    break;  
                case "d":
                    if(fActual == ii){
                        cont = cont + 1;
                    }else{
                        cont = 0;
                    }
                    break;
            }
            
            if (cont == 3){
                resp = true;
            }
        }
        return cont;
    }

}
