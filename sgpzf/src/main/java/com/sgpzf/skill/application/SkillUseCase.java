package com.sgpzf.skill.application;

import com.sgpzf.skill.domain.entity.Skill;
import com.sgpzf.skill.domain.service.SkillService;

public class SkillUseCase {
    private final SkillService skillService;

    public SkillUseCase(SkillService skillService) {
        this.skillService = skillService;
    }
    
    public Boolean createSkill(Skill newSkill){
        return skillService.createSkill(newSkill);
    }
}
