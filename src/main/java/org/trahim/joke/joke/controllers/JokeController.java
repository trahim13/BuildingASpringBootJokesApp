package org.trahim.joke.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.trahim.joke.joke.service.JokeService;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", "joke", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
