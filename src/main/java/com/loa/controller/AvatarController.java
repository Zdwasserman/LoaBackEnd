package com.loa.controller;

import com.loa.model.Avatar;
import com.loa.repository.AvatarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zacharywasserman on 10/31/16.
 */
@CrossOrigin("http://localhost:9000")
@RestController
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
        System.out.println("works");
        return avatarrepo.findAll();
    }

    public int calculateExperience(int minutes)
    {
        int experiencePoints = minutes / 10;
        return experiencePoints;
    }

    public void updateStats(Avatar avatar, String activity, int minutes)
    {
        int experiencePoints = calculateExperience(minutes);
        switch(activity)
        {
            case "run":     avatar.setStamina(avatar.getStamina()+ experiencePoints);
                            avatar.setStrength(avatar.getStrength()+ (experiencePoints/2));
                            break;
            case "lift weights": avatar.setStrength(avatar.getStrength() + experiencePoints);
                                 avatar.setStamina(avatar.getStamina()+ (experiencePoints/2));
            case "study":   avatar.setIntelligence(avatar.getIntelligence()+ experiencePoints);
                            break;
            case "play instrument": avatar.setDexterity(avatar.getDexterity()+ experiencePoints);
                                    avatar.setCharisma((avatar.getCharisma() + experiencePoints));
                                    break;
            case "draw": avatar.setDexterity(avatar.getDexterity()+ experiencePoints);
                         break;
            case "dance": avatar.setCharisma((avatar.getCharisma() + experiencePoints));
                          avatar.setStamina(avatar.getStamina()+ experiencePoints);
                          break;
        }


    }

}
