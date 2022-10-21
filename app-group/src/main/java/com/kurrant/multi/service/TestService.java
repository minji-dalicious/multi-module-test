package com.kurrant.multi.service;

import com.kurrant.multi.domain.CustomerCorp;
import com.kurrant.multi.repository.CustomerCorpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final CustomerCorpRepository customerCorpRepository;
    public List<CustomerCorp> test() {
        return customerCorpRepository.findAll();
    }
}
