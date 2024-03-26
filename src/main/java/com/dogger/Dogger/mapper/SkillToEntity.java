package com.dogger.Dogger.mapper;

import com.dogger.Dogger.dto.SkillDto;
import com.dogger.Dogger.model.Skill;

public class SkillToEntity {
    private SkillDto skillDto;

    public SkillToEntity(SkillDto skillDto) {
        this.skillDto = skillDto;
    }

    public static Skill skillDtoToEntity(SkillDto skillDto){
        Skill skill = new Skill();
        skill.setAccount(skillDto.getAccount());
        skill.setSkill(skillDto.getSkill());
        return skill;
    }
}
