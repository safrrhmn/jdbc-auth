package com.batul.domain.repository;

import com.batul.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findUserEntityByUsername (String username);
}
