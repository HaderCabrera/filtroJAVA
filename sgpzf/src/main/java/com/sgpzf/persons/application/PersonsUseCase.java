package com.sgpzf.persons.application;

import com.sgpzf.persons.domain.entity.Persons;
import com.sgpzf.persons.domain.service.PersonsService;

public class PersonsUseCase {
    private final PersonsService personsService;

    public PersonsUseCase(PersonsService personsService) {
        this.personsService = personsService;
    }
    
    public Boolean createPersons(Persons persons){
        return personsService.createPersons(persons);
    }
    public Boolean modifiedPersons(Persons persons){
        return personsService.modifiedPersons(persons);
    }
    public Persons getPersonsById(Long id){
        return personsService.getPersonsById(id);
    }
    public Boolean deletePersons(Long id){
        return personsService.deletePersons(id);
    }
}
