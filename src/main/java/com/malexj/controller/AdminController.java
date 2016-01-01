package com.malexj.controller;

import com.malexj.constant.Constant;
import com.malexj.repository.PostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

    @Autowired
    private PostgresRepository repository;

    @Autowired
    private Constant constant;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute(constant.CURRENT_PAGE, "admin");
        model.addAttribute("contents", repository.getListContent());
        model.addAttribute("titleContent", "Content");
        model.addAttribute("sections", repository.getListSection());
        model.addAttribute("titleSection", "Section");
        model.addAttribute("contents_sections", repository.getListContentFromContentSection());
        model.addAttribute("titleContentSection", "ContentSection");
        return constant.PAGE;
    }
}
