package com.kurrant.multi.service;

import com.kurrant.multi.domain.User;
import com.kurrant.multi.domain.CustomerCorp;
import com.kurrant.multi.repository.CustomerCorpRepository;
import com.kurrant.multi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final CustomerCorpRepository customerCorpRepository;
    private final UserRepository userRepository;

    public List<CustomerCorp> test() {
        return customerCorpRepository.findAll();
    }

    public User testUser() {
        return userRepository.findById(2).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 유저입니다.")
        );
    }
}
