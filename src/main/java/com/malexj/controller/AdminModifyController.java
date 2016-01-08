package com.malexj.controller;

import com.malexj.constant.Constant;
import com.malexj.entity.Content;
import com.malexj.repository.PostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/admin/modify")
public class AdminModifyController {

    @Autowired
    private PostgresRepository repository;

    @Autowired
    private Constant constant;


    @RequestMapping(value = "/content", method = RequestMethod.GET)
    public String getModifyContentGet(Model model) {
        model.addAttribute(constant.CURRENT_PAGE, "admin");
        model.addAttribute(constant.ADMIN_PAGE, "modifyContent");
        model.addAttribute("admins", repository.getListAdmin());
        model.addAttribute("contents", repository.getListContent());
        model.addAttribute("titleContent", "Content");
        return constant.PAGE;
    }


    @RequestMapping(value = "/content", method = RequestMethod.POST)
    public String getModifyContentPost(Model model,
                                       @RequestParam(value = "insert_name", required = false) String name_insert,
                                       @RequestParam(value = "insert_path", required = false) String path_insert,
                                       @RequestParam(value = "delete_id", required = false) Integer id_delete,
                                       @RequestParam(value = "update_id", required = false) Integer id_update,
                                       @RequestParam(value = "update_name", required = false) String name_update,
                                       @RequestParam(value = "update_path", required = false) String path_update,
                                       @RequestParam(value = "command_clear", required = false) String clear) {
        model.addAttribute(constant.CURRENT_PAGE, "admin");
        model.addAttribute(constant.ADMIN_PAGE, "modifyContent");

        if (validateParamInsert(name_insert, path_insert)) {
            Content content = new Content(name_insert, path_insert);
            repository.setContent(content);
        }

        if (validateParamDelete(id_delete)) {
            Content content = new Content(id_delete);
            repository.deleteContent(content);
        }

        if (validateParamUpdate(id_update, name_update, path_update)) {
            Content content = new Content(id_update, name_update, path_update);
            repository.updateContent(content);
        }

        if(validateParamClear(clear)){
            repository.clearContent();
        }

        model.addAttribute("admins", repository.getListAdmin());
        model.addAttribute("contents", repository.getListContent());
        model.addAttribute("titleContent", "Content");
        return constant.PAGE;
    }

    private boolean validateParamClear(String clear) {
        return clear != null && clear.equals("clear");
    }

    private boolean validateParamUpdate(Integer id, String name, String path) {
        return (id != null && id > 0) && !(name == null || path == null) && !(name.equals("") || path.equals(""));
    }

    private boolean validateParamDelete(Integer id) {
        return id != null && id > 0;
    }

    private boolean validateParamInsert(String name, String path) {
        return !(name == null || path == null) && !(name.equals("") || path.equals(""));
    }
}
