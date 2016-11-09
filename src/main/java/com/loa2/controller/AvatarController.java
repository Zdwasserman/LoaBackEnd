package com.loa2.controller;

import com.loa2.model.Avatar;
import com.loa2.repository.AvatarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by zacharywasserman on 10/31/16.
 */
@CrossOrigin("http://localhost:9000")
@RestController
//@RequestMapping(value = "/avatars")
public class AvatarController
{
    @Autowired
    AvatarRepository avatarrepo;

    @Autowired
    Avatar avatar;

    public AvatarController(AvatarRepository avatarrepo, Avatar avatar){ this.avatarrepo = avatarrepo; this.avatar = avatar;}




    @RequestMapping(value = "/createAvatar", method = RequestMethod.POST)
    public Avatar createAvatar(@RequestBody Avatar avatar)
    {
        System.out.println(avatar);
        avatarrepo.save(avatar);
        return avatar;
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Avatar> getAvatar()
    {
       return avatarrepo.findAll();
    }

}
