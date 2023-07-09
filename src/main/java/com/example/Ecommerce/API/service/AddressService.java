package com.example.Ecommerce.API.service;

import com.example.Ecommerce.API.model.Address;
import com.example.Ecommerce.API.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public Address createAddress(Address address) {
       return iAddressRepo.save(address);
    }

    public List<Address> getAllAddress() {
        return iAddressRepo.findAll();
    }
}
