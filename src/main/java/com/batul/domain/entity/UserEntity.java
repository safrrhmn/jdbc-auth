package com.batul.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class UserEntity {
    @GeneratedValue
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "USERNAME", nullable = false, unique = true)
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ROLE")
    private String role;
    @Column(name = "IS_ACCOUNT_EXPIRED", nullable = false)
    private Boolean isAccountExpired;
    @Column(name = "IS_ACCOUNT_LOCKED", nullable = false)
    private Boolean isAccountLocked;
    @Column(name = "IS_CREDENTIALS_EXPIRED", nullable = false)
    private Boolean isCredentialsExpired;
    @Column(name = "IS_USER_ENABLED", nullable = false)
    private Boolean isUserEnabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getAccountExpired() {
        return isAccountExpired;
    }

    public void setAccountExpired(Boolean accountExpired) {
        isAccountExpired = accountExpired;
    }

    public Boolean getAccountLocked() {
        return isAccountLocked;
    }

    public void setAccountLocked(Boolean accountLocked) {
        isAccountLocked = accountLocked;
    }

    public Boolean getCredentialsExpired() {
        return isCredentialsExpired;
    }

    public void setCredentialsExpired(Boolean credentialsExpired) {
        isCredentialsExpired = credentialsExpired;
    }

    public Boolean getUserEnabled() {
        return isUserEnabled;
    }

    public void setUserEnabled(Boolean userEnabled) {
        isUserEnabled = userEnabled;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", isAccountExpired=" + isAccountExpired +
                ", isAccountLocked=" + isAccountLocked +
                ", isCredentialsExpired=" + isCredentialsExpired +
                ", isUserEnabled=" + isUserEnabled +
                '}';
    }
}
