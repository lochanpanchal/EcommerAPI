package com.example.Ecommerce.API.repository;

import com.example.Ecommerce.API.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
