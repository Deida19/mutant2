    package com.deida.mutant.Model;
    

import javax.persistence.*;

    @Entity
    @Table(name = "dna")
    public class dnaModel{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(unique = true, nullable = false)
        private Long id;
        private Boolean mutante;

     
        public void setId(Long id){
            this.id = id;
        }

        public Long getId(){
            return id;
        }

        public void setMutante(Boolean mutante){
            this.mutante = mutante;
        }

        public Boolean getMutante(){
            return mutante;
        }

      
    }