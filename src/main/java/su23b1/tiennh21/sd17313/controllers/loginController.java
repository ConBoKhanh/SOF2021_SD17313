package su23b1.tiennh21.sd17313.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class loginController {



    @GetMapping("login")
    public String loginFrom(){
        return "login";
    }

    @PostMapping("login")
    public String login(
            @RequestParam(value = "name",defaultValue = "null") String username,
            @RequestParam("pass") String pass,
            @RequestParam("check") Optional<Boolean> check
            ){
        System.out.println(username);
        System.out.println(pass);
        System.out.println(check.get());
        return "login";
    }
}
