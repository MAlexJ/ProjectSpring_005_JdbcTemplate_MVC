package com.malexj.controller;

import com.malexj.constant.Constant;
import com.malexj.repository.PostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private PostgresRepository repository;

    @Autowired
    private Constant constant;

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute(constant.CURRENT_PAGE, "admin");
        model.addAttribute("admins", repository.getListAdmin());
        model.addAttribute("titleAdmin", "Admin");
        model.addAttribute("contents", repository.getListContent());
        model.addAttribute("titleContent", "Content");
        model.addAttribute("sections", repository.getListSection());
        model.addAttribute("titleSection", "Section");
        model.addAttribute("contents_sections", repository.getListContentFromContentSection());
        model.addAttribute("titleContentSection", "ContentSection");
        return constant.PAGE;
    }

    @RequestMapping(value = "/elements", method = RequestMethod.GET)
    public String getElements(Model model) {
        model.addAttribute("admins", repository.getListAdmin());
        model.addAttribute(constant.CURRENT_PAGE, "admin");
        model.addAttribute(constant.ADMIN_PAGE, "elements");
        return constant.PAGE;
    }

    @RequestMapping(value = "/forms", method = RequestMethod.GET)
    public String getForms(Model model) {
        model.addAttribute("admins", repository.getListAdmin());
        model.addAttribute(constant.CURRENT_PAGE, "admin");
        model.addAttribute(constant.ADMIN_PAGE, "forms");
        return constant.PAGE;
    }

    @RequestMapping(value = "/grid", method = RequestMethod.GET)
    public String getGrid(Model model) {
        model.addAttribute("admins", repository.getListAdmin());
        model.addAttribute(constant.CURRENT_PAGE, "admin");
        model.addAttribute(constant.ADMIN_PAGE, "grid");
        return constant.PAGE;
    }

    @RequestMapping(value = "/tables", method = RequestMethod.GET)
    public String getTables(Model model) {
        model.addAttribute("admins", repository.getListAdmin());
        model.addAttribute(constant.CURRENT_PAGE, "admin");
        model.addAttribute(constant.ADMIN_PAGE, "tables");
        model.addAttribute("contents", repository.getListContent());
        model.addAttribute("titleContent", "Content");
        model.addAttribute("sections", repository.getListSection());
        model.addAttribute("titleSection", "Section");
        model.addAttribute("contents_sections", repository.getListContentFromContentSection());
        model.addAttribute("titleContentSection", "ContentSection");
        return constant.PAGE;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String getLogout(Model model) {
        //TODO Logout
        model.addAttribute("contents", repository.getListContent());
        return constant.PAGE;
    }
}
