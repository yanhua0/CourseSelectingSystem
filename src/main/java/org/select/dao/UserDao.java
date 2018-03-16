package org.select.dao;

import org.select.entity.User;

public interface UserDao {
    User queryByUsername(String username);
}
