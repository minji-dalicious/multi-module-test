package com.kurrant.multi.security;

import com.kurrant.multi.UserDetailsImpl;
import com.kurrant.multi.domain.User;
import com.kurrant.multi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByName(username)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 유저입니다."));
        return new UserDetailsImpl(user);
    }
}
