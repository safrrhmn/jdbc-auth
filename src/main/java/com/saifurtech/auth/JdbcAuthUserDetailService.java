package com.saifurtech.auth;

import com.saifurtech.domain.entity.UserEntity;
import com.saifurtech.domain.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JdbcAuthUserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    public JdbcAuthUserDetailService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = this.userRepository.findUserEntityByUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("Could not find user with username: " + username);
        }
        return new JdbcAuthUserDetails(userEntity);
    }

}
