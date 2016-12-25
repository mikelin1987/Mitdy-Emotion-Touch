package com.mitdy.et.security.persistence.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mitdy.core.persistence.JpaAbstractEntityDao;
import com.mitdy.et.security.domain.User;
import com.mitdy.et.security.persistence.UserDao;

@Transactional
@Repository("userDao")
public class UserDaoImpl extends JpaAbstractEntityDao<User> implements UserDao {

    @Override
    public User findByUsername(String username) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("username", username);
        List<User> results = findWith("username = :username", params);
        
        return (results.size() > 0 ? results.get(0) : null);
    }

}
