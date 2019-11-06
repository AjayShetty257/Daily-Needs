package com.daily.needs.service;


import com.daily.needs.entity.User;

import java.util.Collection;

/**
 * Created By Ajay Shetty on 3/13/2018.
 */
public interface UserService {
    User findOne(String email);

    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
