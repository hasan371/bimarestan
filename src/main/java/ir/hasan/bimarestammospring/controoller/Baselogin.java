package ir.hasan.bimarestammospring.controoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class Baselogin {

    @RequestMapping( value = "/",method = RequestMethod.GET)
    String home() {
        return "person.html";
    }
}
