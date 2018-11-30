package com.batul.auth;

import com.batul.domain.entity.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class JdbcAuthUserDetails implements UserDetails {

    private UserEntity userEntity;

    JdbcAuthUserDetails(UserEntity userEntity) {
        super();
        this.userEntity = userEntity;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(this.userEntity.getRole());
        return Collections.singleton(authority);
    }

    @Override
    public String getPassword() {
        return this.userEntity.getPassword();
    }

    @Override
    public String getUsername() {
        return this.userEntity.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return !this.userEntity.getAccountExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return !this.userEntity.getAccountLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return !this.userEntity.getCredentialsExpired();
    }

    @Override
    public boolean isEnabled() {
        return !this.userEntity.getUserEnabled();
    }
}
