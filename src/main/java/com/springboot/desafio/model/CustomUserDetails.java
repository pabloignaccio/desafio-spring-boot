package com.springboot.desafio.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomUserDetails implements UserDetails {

    private String username;
    private String password;
    private boolean enabled;
    private Collection<? extends GrantedAuthority> authorities;

    // Constructor
    public CustomUserDetails(String username, String password, boolean enabled, Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Puedes modificar esto según la lógica de tu aplicación
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Puedes modificar esto según la lógica de tu aplicación
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Puedes modificar esto según la lógica de tu aplicación
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}