package com.sgpzf.personSkill.application;

import com.sgpzf.personSkill.domain.service.PersonSkillService;
import com.sgpzf.personSkill.domain.entity.PersonSkill;

public class PersonSkillUseCase {
    private final PersonSkillService personSkillService;

    public PersonSkillUseCase(PersonSkillService personSkillService) {
        this.personSkillService = personSkillService;
    }
    
    public Boolean addSkillToPerson(PersonSkill personSkill){
        return personSkillService.addSkillToPerson(personSkill);
    }
}
