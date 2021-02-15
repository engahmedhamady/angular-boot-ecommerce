package com.spring.Boot.ECommerceBoot.controllers;

import com.spring.Boot.ECommerceBoot.entities.State;
import com.spring.Boot.ECommerceBoot.service.StateService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/state")
@CrossOrigin("http://localhost:4200")
public class StateController {

    @Autowired
    private  StateService stateService = null;

    public StateService getStateService() {
        return stateService;
    }

    public void setStateService(StateService stateService) {
        this.stateService = stateService;
    }
    

    @GetMapping(value = "/stateByCountryIdData/{id}")
    public List<State> getProductData(@PathVariable("id") int Id) {
        List<State> listAllProducts = stateService.findStateByCountryId(Id);
        return listAllProducts;
    }

    @GetMapping(value = "/stateDataById/{id}")
    public State getProductByIdData(@PathVariable("id") int Id) {

        State findProductById = stateService.findStateById(Id);
        return findProductById;
    }

    @PostMapping(value = "/addState")
    public State AddPurchase(@RequestBody State stateBean) {
        State addStateBean = stateService.addStateBean(stateBean);

        return addStateBean;
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
