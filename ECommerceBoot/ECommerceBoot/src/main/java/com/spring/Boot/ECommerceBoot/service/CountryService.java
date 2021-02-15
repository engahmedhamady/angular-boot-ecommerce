/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.Boot.ECommerceBoot.service;

import com.spring.Boot.ECommerceBoot.entities.Country;
import com.spring.Boot.ECommerceBoot.entities.State;
import com.spring.Boot.ECommerceBoot.repository.CountryRepository;
import com.spring.Boot.ECommerceBoot.repository.StateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CountryService {
   @Autowired
private CountryRepository countryRepository  =null;

    public List<Country> listAllCountries() {
       //To change body of generated methods, choose Tools | Templates.
       List<Country> findAll = countryRepository.findAll();
       return findAll;
    }

    public Country findCountryById(int Id) {
       //To change body of generated methods, choose Tools | Templates.
       Country orElseThrow = countryRepository.findById(Id).orElseThrow(null);
       return orElseThrow;
    }

  
  
  
}
