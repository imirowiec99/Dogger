package com.dogger.Dogger.service;

import com.dogger.Dogger.repository.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterestService {
    private final InterestRepository interestRepository;

    @Autowired

    public InterestService(InterestRepository interestRepository) {
        this.interestRepository = interestRepository;
    }
}
