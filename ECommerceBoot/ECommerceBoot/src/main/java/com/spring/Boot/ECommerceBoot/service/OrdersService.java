/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.Boot.ECommerceBoot.service;

import com.spring.Boot.ECommerceBoot.entities.Orders;
import com.spring.Boot.ECommerceBoot.entities.State;
import com.spring.Boot.ECommerceBoot.repository.CountryRepository;
import com.spring.Boot.ECommerceBoot.repository.OrdersRepository;
import com.spring.Boot.ECommerceBoot.repository.StateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class OrdersService {
   @Autowired
private OrdersRepository ordersRepository  =null;

    public List<Orders> listAllOrders() {
       //To change body of generated methods, choose Tools | Templates.
       List<Orders> findAll = ordersRepository.findAll();
       return findAll;
    }

    public Orders addPurchase(Orders ordersBean) {
       //To change body of generated methods, choose Tools | Templates.
       Orders save = ordersRepository.save(ordersBean);
       return  save;
    }

    public Orders findOrderById(int Id) {
    //To change body of generated methods, choose Tools | Templates.
      return ordersRepository.findById(Id).orElseThrow(null);
    }

  
  
  
}
