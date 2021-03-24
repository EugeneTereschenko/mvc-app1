package ua.udgin.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello() {

        System.out.println("test controller");
        //return "display.jsp";
        return "hello_world";
        //return "./WEB-INF/views/hello_world.html";
    }
}
