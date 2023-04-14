package com.salt.atufa.addressbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salt.atufa.addressbook.model.Address;
@Service
public class AddressServiceImplementation implements AddressService {
    ArrayList<Address> listOfAddress = new ArrayList<>();
    @Override
    public String createAddress(Address address) {
        listOfAddress.add(address);
        // TODO Auto-generated method stub
        return "success";
    }

    @Override
    public List<Address> getAddress() {
        return listOfAddress;
    }

    @Override
    public String updateAddress(Address address) {
       boolean result = false;
        for(int i=0; i<listOfAddress.size();i++){
            if(listOfAddress.get(i).getEmail().equals(address.getEmail())){
                listOfAddress.set(i, address);
                result = true;
                break;
            }
        }
        if (result){
            return "updated";
        }else {
            return "not updated";
        }
    }

    @Override
    public String deleteAddress(String email) {
        boolean result = false;
        for(int i=0; i<listOfAddress.size();i++){
            if(listOfAddress.get(i).getEmail().equals(email)){
                listOfAddress.remove(i);
                result = true;
                break;
            }
        }
        if (result){
            return "deleted";
        }else {
            return "not deleted";
        }
    }
    
}
