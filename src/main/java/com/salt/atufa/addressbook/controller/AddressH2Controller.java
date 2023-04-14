package com.salt.atufa.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salt.atufa.addressbook.model.AddressH2;
import com.salt.atufa.addressbook.service.AddressRepository;

@RestController
@RequestMapping("/api/addresses")
public class AddressH2Controller {
   
    @Autowired
    private AddressRepository addressRepository;
    
    @GetMapping
    public List<AddressH2> getAllAddresses() {
        return addressRepository.findAll();
    }
    
    @PostMapping
    public AddressH2 addAddress(@RequestBody AddressH2 address) {
        return addressRepository.save(address);
    }
}


