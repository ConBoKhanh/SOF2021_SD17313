package su23b1.tiennh21.sd17313.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class HelloController {
    private int i = 1;
    @GetMapping("say-hello")
    public String sayHello(Model model){
        i++;
        System.out.println("hello "+i);
        String username = "duyMaiDinh";
        model.addAttribute("name",username);

        return "hello";
    }

    @GetMapping("login")
    public String getFoginFrom(){
        return "login";
    }
//    modelAttribute
    @ModelAttribute("chuyenNganh")
    public String chuyenNganh(){
        return "NganhPhatTrienPhanMem";
    }
}
