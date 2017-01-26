package com.loa.services;

import com.loa.model.Avatar;
import com.loa.repository.AvatarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by zachary on 1/26/17.
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    private AvatarRepository avatarRepository;
    @Autowired
    public UserServiceImpl(AvatarRepository avatarRepository)
    {
        this.avatarRepository = avatarRepository;
    }
    @Override
    public Avatar findByUserName(String username) {
        return avatarRepository.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Avatar avatar = findByUserName(username);
        if(avatar == null)
        {
            throw new UsernameNotFoundException(username);
        }
        return new UserDetailsImpl(avatar);
    }
}
