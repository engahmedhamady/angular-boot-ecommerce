/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.Boot.ECommerceBoot.repository;

import com.spring.Boot.ECommerceBoot.entities.State;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>{
    public List<State> findByName(String name);
    
       public List<State> findByCountryId(Integer id ); 

  
       
}
