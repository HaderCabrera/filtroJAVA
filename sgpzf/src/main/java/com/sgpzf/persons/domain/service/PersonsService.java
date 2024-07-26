package com.sgpzf.persons.domain.service;

import com.sgpzf.persons.domain.entity.Persons;

public interface PersonsService {
    Boolean createPersons(Persons persons);
    Boolean modifiedPersons(Persons persons);
    Persons getPersonsById(Long id);
}
