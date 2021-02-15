package com.spring.Boot.ECommerceBoot.controllers;

import com.spring.Boot.ECommerceBoot.entities.Country;
import com.spring.Boot.ECommerceBoot.service.CountryService;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/country")
@CrossOrigin("http://localhost:4200")
public class CountryController {

    @Autowired
    private CountryService countryService= null;

    public CountryService getCountryService() {
        return countryService;
    }

    public void setCountryService(CountryService countryService) {
        this.countryService = countryService;
    }
    
    
   
    @GetMapping(value = "/countryData")
    public List<Country> getProductData() {
        List<Country> listAllProducts = countryService.listAllCountries();
        return listAllProducts;
    }
    @GetMapping(value = "/countryDataById/{id}")
    public Country getProductByIdData(@PathVariable("id")int Id) {
          
       Country findProductById = countryService.findCountryById(Id);
        return findProductById;
    }
    
  
    
    
    
//     @GetMapping(value = "/countrySearch/{name}")
//    public  List<ProductsBean>getProductByCategoryData(@PathVariable("name")String name) {
//        List<ProductsBean> listProductsByCategory = storeGetway.listProductsByContain(name);
//         System.out.println(name);
//        return listProductsByCategory;
//    }
//    
//    
    
 
}
