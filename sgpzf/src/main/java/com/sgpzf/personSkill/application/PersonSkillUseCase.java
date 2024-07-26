package com.sgpzf.personSkill.application;

import com.sgpzf.personSkill.domain.service.PersonSkillService;

public class PersonSkillUseCase {
    private final PersonSkillService personSkillService;

    public PersonSkillUseCase(PersonSkillService personSkillService) {
        this.personSkillService = personSkillService;
    }
    
    public Boolean addSkillToPerson(Long skill){
        return personSkillService.addSkillToPerson(skill);
    }
}
