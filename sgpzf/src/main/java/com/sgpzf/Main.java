package com.sgpzf;

import com.sgpzf.persons.application.PersonsUseCase;
import com.sgpzf.persons.domain.service.PersonsService;
import com.sgpzf.persons.infraestructure.in.PersonsController;
import com.sgpzf.persons.out.PersonsRepository;

public class Main {
    public static void main(String[] args) {
        PersonsService personsService = new PersonsRepository();
        PersonsUseCase personsUseCase = new PersonsUseCase(personsService);
        PersonsController personsController = new PersonsController(personsUseCase);
        personsController.createPersons();
    }
}