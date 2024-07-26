package com.sgpzf.persons.domain.entity;

public class Persons {
    private Long id;
    private String name;
    private String lastname;
    private Long idcity;
    private String address;
    private Long age;
    private String email;
    private Long idgender;

    public Persons() {
    }

    public Persons(Long id, String name, String lastname, Long idcity, String address, Long age, String email,
            Long idgender) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.idcity = idcity;
        this.address = address;
        this.age = age;
        this.email = email;
        this.idgender = idgender;
    }

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getIdcity() {
        return idcity;
    }

    public void setIdcity(Long idcity) {
        this.idcity = idcity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdgender() {
        return idgender;
    }

    public void setIdgender(Long idgender) {
        this.idgender = idgender;
    }
    
}
