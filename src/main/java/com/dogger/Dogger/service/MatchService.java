package com.dogger.Dogger.service;

import com.dogger.Dogger.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
    private final MatchRepository matchRepository;

    @Autowired

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }
}
