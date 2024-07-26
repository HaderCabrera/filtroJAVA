package com.sgpzf;

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
        // PersonsService personsService = new PersonsRepository();
        // PersonsUseCase personsUseCase = new PersonsUseCase(personsService);
        // PersonsController personsController = new PersonsController(personsUseCase);
        // personsController.createPersons();

        // PersonSkillService personSkillService = new PersonSkillRepository();
        // PersonSkillUseCase personSkillUseCase = new PersonSkillUseCase(personSkillService);
        // PersonSkillController personSkillController = new PersonSkillController(personSkillUseCase);
        // personSkillController.addSkillToPerson();

        SkillService skillService = new skillRepository();
        SkillUseCase skillUseCase = new SkillUseCase(skillService);
        SkillController skillController = new SkillController(skillUseCase);
        skillController.createSkill();
    }
}