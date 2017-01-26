package com.loa.services;

import com.loa.model.Avatar;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Created by zachary on 1/26/17.
 */
public class UserDetailsImpl implements UserDetails{

    private Avatar avatar;
    public UserDetailsImpl(Avatar avatar)
    {
        this.avatar = avatar;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return avatar.getPassword();
    }

    @Override
    public String getUsername() {
        return avatar.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
