package com.salt.atufa.addressbook.service;


import org.springframework.data.jpa.repository.JpaRepository;

import com.salt.atufa.addressbook.model.AddressH2;

public interface AddressRepository extends JpaRepository<AddressH2, Long> {

  
}


