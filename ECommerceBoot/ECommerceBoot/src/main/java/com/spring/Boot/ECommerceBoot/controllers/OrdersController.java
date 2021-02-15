package com.spring.Boot.ECommerceBoot.controllers;

import com.spring.Boot.ECommerceBoot.entities.Orders;
import com.spring.Boot.ECommerceBoot.service.OrdersService;

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
@RequestMapping(value = "/purchase")
@CrossOrigin("http://localhost:4200")
public class OrdersController {

    @Autowired
    private OrdersService ordersService = null;

    public OrdersService getOrdersService() {
        return ordersService;
    }

    public void setOrdersService(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    Orders o = new Orders();

    @GetMapping(value = "/allPurchase")
    public List<Orders> getPurchase() {
        List<Orders> listProductsByCategory = ordersService.listAllOrders();

        return listProductsByCategory;
    }

    @PostMapping(value = "/addpurchase")
    public Orders AddPurchase(@RequestBody Orders ordersBean) {
        System.out.println(ordersBean.getOrderId());
        System.out.println(ordersBean.getTotalPrice());
        System.out.println(ordersBean.getTotalQuantity());
        System.out.println(ordersBean.getCustomers().getFname());
        System.out.println(ordersBean.getLastUpdate());

        Orders bean = ordersService.addPurchase(ordersBean);

        return bean;
    }

    @GetMapping(value = "/orderDataById/{id}")
    public Orders getOrdersByIdData(@PathVariable("id") int Id) {

        Orders findProductById = ordersService.findOrderById(Id);
        return findProductById;
    }

}
