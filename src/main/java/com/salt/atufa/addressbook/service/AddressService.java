package com.salt.atufa.addressbook.service;

import java.util.List;

import com.salt.atufa.addressbook.model.Address;

public interface AddressService {
   public String createAddress(Address address);
   public List<Address>  getAddress();
   public String updateAddress (Address address);
   public String deleteAddress(String email);
}
