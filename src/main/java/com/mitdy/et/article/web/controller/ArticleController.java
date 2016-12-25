package com.mitdy.et.article.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mitdy.shopping.security.web.dubbo.UserDTO;
import com.mitdy.shopping.security.web.dubbo.UserServiceApi;

@Controller
@RequestMapping("article")
public class ArticleController {
    
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserServiceApi userServiceApi;

    @RequestMapping("/article-list")
    public String userList(Model model) {
        UserDTO userDTO = userServiceApi.findUserByUsername("user2");
        
        logger.info("userDTO: {}", userDTO);
        
        model.addAttribute("user", userDTO);
        
        return "article-list";
    }


}
