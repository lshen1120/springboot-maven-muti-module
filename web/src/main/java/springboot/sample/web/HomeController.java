package springboot.sample.web;

/**
 * Created by SL on 2017/1/3.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.sample.service.UserService;


@Controller
public class HomeController {


    @Autowired
    UserService userService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return userService.getName()+" add";
    }



    @RequestMapping("/greeting")
    public String greeting(Model model){
        model.addAttribute("name","<>123中文");
        return"greeting";

    }

}
