package main.java.controller;

import main.java.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping
public class UserController {

    @ModelAttribute
    public void addCommonData(Model model) {
        model.addAttribute("commonData", "This is some common string.");
    }

    @GetMapping
    public ModelAndView getRegisterView() {
        return new ModelAndView("registerForm");
    }

    @PostMapping(value = "/register")
    public ModelAndView registerUser(@Valid @ModelAttribute User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("registerForm");
        }

        ModelAndView modelAndView = new ModelAndView("landingPage");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
