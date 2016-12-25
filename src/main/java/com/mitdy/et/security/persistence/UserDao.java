package com.mitdy.et.security.persistence;

import com.mitdy.core.persistence.AbstractEntityDao;
import com.mitdy.et.security.domain.User;

public interface UserDao extends AbstractEntityDao<User> {
    
    public User findByUsername(String username);

}
