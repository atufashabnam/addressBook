package com.salt.atufa.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.salt.atufa.addressbook.model.Address;
import com.salt.atufa.addressbook.service.AddressService;

@RestController
@RequestMapping(path = "/address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping
    public String createAddressFromController(@RequestBody Address address){
        String result = addressService.createAddress(address);
        if (result.equals("success")){
            return "Address created successfully";
        }else{
            return "failed" ;
        }
    }

    @GetMapping
    public List<Address> getAdrress (){
       return  addressService.getAddress();
    }

    @PutMapping
    public String updateAddress (@RequestBody Address address){
       return  addressService.updateAddress(address);
    }

    @DeleteMapping
    public String deleteAddress (@RequestParam String email){
       return  addressService.deleteAddress(email);
    }
}
