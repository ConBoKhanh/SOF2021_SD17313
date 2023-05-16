package su23b1.tiennh21.sd17313.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {



    @GetMapping("login")
    public String loginFrom(){
        return "login";
    }

    @PostMapping("login")
    public String login(
            @RequestParam("name") String username,
            @RequestParam("pass") String pass
    ){
        System.out.println(username);
        System.out.println(pass);
        return "login";
    }
}
