package habsida.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String showUserPage(Principal principal, Model model) {
        model.addAttribute("username", principal.getName());
        return "user";
    }
}
