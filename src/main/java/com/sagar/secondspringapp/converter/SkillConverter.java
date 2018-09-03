package com.sagar.secondspringapp.converter;

import com.sagar.secondspringapp.dto.SkillDto;
import com.sagar.secondspringapp.entity.Skill;

public class SkillConverter {

    public static Skill dtoToEntity(SkillDto skillDto) {
        Skill skill = new Skill(skillDto.getSkillName(), null);
        skill.setSkillId(skillDto.getSkillId());
        return skill;
    }

    public static SkillDto entityToDto(Skill skill){
        SkillDto skillDto = new SkillDto(skill.getSkillId(),skill.getSkillName());
        return skillDto;
    }
}