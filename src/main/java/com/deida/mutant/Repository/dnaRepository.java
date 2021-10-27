package com.deida.mutant.Repository;

import com.deida.mutant.Model.dnaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dnaRepository extends CrudRepository<dnaModel, Long>{
    
}
