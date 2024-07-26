package com.sgpzf.personSkill.domain.entity;

import java.util.Date;

public class PersonSkill {
    private Long id;
    private Date registration_date;
    private Long idskill;
    public PersonSkill() {
    }
    public PersonSkill(Long id, Date registration_date, Long idskill) {
        this.id = id;
        this.registration_date = registration_date;
        this.idskill = idskill;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getRegistration_date() {
        return registration_date;
    }
    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }
    public Long getIdskill() {
        return idskill;
    }
    public void setIdskill(Long idskill) {
        this.idskill = idskill;
    }
    
}
