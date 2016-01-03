package com.malexj.controller;

import com.malexj.constant.Constant;
import com.malexj.repository.PostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin/modify")
public class AdminModifyController {

    @Autowired
    private PostgresRepository repository;

    @Autowired
    private Constant constant;


    @RequestMapping(value = "/content", method = RequestMethod.GET)
    public String getModifyContent(Model model) {
        model.addAttribute(constant.CURRENT_PAGE, "admin");
        model.addAttribute(constant.ADMIN_PAGE, "modifyContent");
        model.addAttribute("admins", repository.getListAdmin());
        model.addAttribute("contents", repository.getListContent());
        model.addAttribute("titleContent", "Content");
        return constant.PAGE;
    }
}
