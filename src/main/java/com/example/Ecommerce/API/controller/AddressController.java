package com.example.Ecommerce.API.controller;

import com.example.Ecommerce.API.model.Address;
import com.example.Ecommerce.API.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("addressC")
    public Address createAddress(@RequestBody Address address)
    {
        return addressService.createAddress(address);
    }

    @GetMapping("AddressS")
    public List<Address> getAllAddress(){
        return  addressService.getAllAddress();
    }
}
