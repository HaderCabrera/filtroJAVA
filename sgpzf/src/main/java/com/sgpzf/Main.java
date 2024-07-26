package com.sgpzf;

import java.util.Scanner;

import com.sgpzf.personSkill.application.PersonSkillUseCase;
import com.sgpzf.personSkill.domain.service.PersonSkillService;
import com.sgpzf.personSkill.infraestructure.in.PersonSkillController;
import com.sgpzf.personSkill.infraestructure.out.PersonSkillRepository;
import com.sgpzf.persons.application.PersonsUseCase;
import com.sgpzf.persons.domain.service.PersonsService;
import com.sgpzf.persons.infraestructure.in.PersonsController;
import com.sgpzf.persons.out.PersonsRepository;
import com.sgpzf.skill.application.SkillUseCase;
import com.sgpzf.skill.domain.service.SkillService;
import com.sgpzf.skill.infraestructure.in.SkillController;
import com.sgpzf.skill.infraestructure.out.skillRepository;

public class Main {
    public static void main(String[] args) {
        PersonsService personsService = new PersonsRepository();
        PersonsUseCase personsUseCase = new PersonsUseCase(personsService);
        PersonsController personsController = new PersonsController(personsUseCase);


        PersonSkillService personSkillService = new PersonSkillRepository();
        PersonSkillUseCase personSkillUseCase = new PersonSkillUseCase(personSkillService);
        PersonSkillController personSkillController = new PersonSkillController(personSkillUseCase);


        SkillService skillService = new skillRepository();
        SkillUseCase skillUseCase = new SkillUseCase(skillService);
        SkillController skillController = new SkillController(skillUseCase);

        Scanner sc = new Scanner(System.in);
        Boolean bandera = true;

        while (bandera) {
            System.out.println(" ");
            System.out.println("SISTEMA GESTOR PERSONAL");
            System.out.println("=============================================");
            System.out.println("1. Registrar una persona");
            System.out.println("2. Asignar una habilidad a una persona");
            System.out.println("3. Crear una nueva habilidad");
            System.out.println("4. Consultar persona por habilidad");
            System.out.println("5. Actualizar Información de una Persona");
            System.out.println("6. Eliminar una Persona");
            System.out.println("7. Salir");
            System.out.println("=============================================");
            System.out.print("Seleccione una opcion: ");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    personsController.createPersons();
                    break;
                case 2:
                    personSkillController.addSkillToPerson();
                    break;
                case 3:
                    skillController.createSkill();
                    break;
                case 4:
                    System.out.println("Servicio en mantenimiento!");
                    break;
                case 5:
                    personsController.modifiedPersons();
                    break;
                case 6:
                    personsController.deletePersons();
                    break;
                case 7:
                    bandera = false;
                break;

            }
        }


    }
}