package org.pfirszt.jaxrsusage.controller;

import org.pfirszt.jaxrsusage.model.Search;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainPageController {

    @GetMapping("/")
    public String getMainPage(Model model)
        {
        model.addAttribute("search", new Search());
        return "search";
    }

    @PostMapping("/search")
    public String greetingSubmit(@ModelAttribute Search search, Model model) {
        model.addAttribute("search", search);
        return "result";
    }

}
