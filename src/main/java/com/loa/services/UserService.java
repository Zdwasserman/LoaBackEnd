package com.loa.services;

import com.loa.model.Avatar;

/**
 * Created by zachary on 1/26/17.
 */
public interface UserService
{
    public Avatar findByUserName(String userName);
}
