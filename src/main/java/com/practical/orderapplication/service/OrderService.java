package com.practical.orderapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    public String getInventoryStatus() {
        String inventoryUrl = "http://localhost:9090/inventory";
        return restTemplate.getForObject(inventoryUrl, String.class);
    }

}
