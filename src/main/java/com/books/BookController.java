package com.books;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    @RequestMapping("/")
    public String books(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @RequestMapping("/create")
    public String create(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "form";
    }

    @RequestMapping("/edit")
    public String edit(@RequestParam(value="id") String id, Model model) {
        model.addAttribute("id", id);
        return "form";
    }

}