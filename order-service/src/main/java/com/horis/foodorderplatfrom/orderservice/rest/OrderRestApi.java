package com.horis.foodorderplatfrom.orderservice.rest;

import com.horis.foodorderplatfrom.orderservice.domain.Order;
import com.horis.foodorderplatfrom.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderRestApi {
    OrderService orderService;

    @Autowired
    public OrderRestApi(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "/restaurants/{rid}/orders", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Order createOder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }
}
