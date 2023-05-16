package su23b1.tiennh21.sd17313.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {
    @GetMapping("login")
    public String loginFrom(){
        return "login";
    }
}
