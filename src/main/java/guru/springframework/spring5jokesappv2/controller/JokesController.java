package guru.springframework.spring5jokesappv2.controller;

import guru.springframework.spring5jokesappv2.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping(path = {"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());

        return "index";
    }
}
