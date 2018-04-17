package com.duckapult.forum.controllers;

import com.duckapult.forum.models.data.MessageDAO;
import com.duckapult.forum.models.data.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="forum")
public class ForumController {

    @Autowired
    UserDAO userDAO;

    @Autowired
    MessageDAO messageDAO;

    public String index(Model model){

        return "forum/index";
    }

}
