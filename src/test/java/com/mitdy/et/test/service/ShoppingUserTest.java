package com.mitdy.et.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mitdy.et.test.base.BaseTest;
import com.mitdy.shopping.security.web.dubbo.UserDTO;
import com.mitdy.shopping.security.web.dubbo.UserServiceApi;

public class ShoppingUserTest extends BaseTest {

    @Autowired
    private UserServiceApi userServiceApi;
    
    @Test
    public void findUserTest1() {
        UserDTO userDTO = userServiceApi.findUserByUsername("user002");
        System.out.println(userDTO);
        
        if (userDTO != null) {
            System.out.println("userDTO.getId(): " + userDTO.getId());
        }
    }

}
