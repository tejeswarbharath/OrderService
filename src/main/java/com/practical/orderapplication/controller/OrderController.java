package com.practical.orderapplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/details")
    public ResponseEntity<String> getOrderDetails(){
        return ResponseEntity.ok("Order Successfull");
    }

}
