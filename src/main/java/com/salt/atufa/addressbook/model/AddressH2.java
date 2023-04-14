package com.salt.atufa.addressbook.model;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class AddressH2 {
    
    private Long id;
    private String name;
    private String address;
    private String phone;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public AddressH2(Long id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    
    public AddressH2() {
    }
    
    @Override
    public String toString() {
        return "AddressH2 [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
    }
    
    
}


