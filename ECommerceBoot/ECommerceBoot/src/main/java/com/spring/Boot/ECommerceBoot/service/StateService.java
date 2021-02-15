/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.Boot.ECommerceBoot.service;

import com.spring.Boot.ECommerceBoot.entities.State;
import com.spring.Boot.ECommerceBoot.repository.StateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StateService {
   @Autowired
private StateRepository stateRepository  =null;

   public StateRepository getStateRepository() {
        return stateRepository;
    }

   public void setStateRepository(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
}

    public List<State> findAllStates() {
    //To change body of generated methods, choose Tools | Templates.
          return stateRepository.findAll();
    }
   public State findStateById(Integer id) {
    //To change body of generated methods, choose Tools | Templates.
          return stateRepository.findById(id).orElseThrow(null);
    }
     public List<State> findStateByName(String id) {
    //To change body of generated methods, choose Tools | Templates.
          return stateRepository.findByName(id);
    }
       public void addState(State state) {
    //To change body of generated methods, choose Tools | Templates.
          stateRepository.save(state);
    }
        public List<State> findStateByCountryId(Integer id) {
    //To change body of generated methods, choose Tools | Templates.
          return stateRepository.findByCountryId(id);
    }

    public State addStateBean(State stateBean) {
       //To change body of generated methods, choose Tools | Templates.
       State save = stateRepository.save(stateBean);
       return  save;
    }
}
