package com.dogger.Dogger.service;

import com.dogger.Dogger.model.Skill;
import com.dogger.Dogger.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    private final SkillRepository skillRepository;

    @Autowired

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public void saveSkill(Skill skill){
        skillRepository.save(skill);
    }
}
