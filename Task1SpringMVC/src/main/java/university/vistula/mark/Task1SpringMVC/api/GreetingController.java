package university.vistula.mark.Task1SpringMVC.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping("/")
    @ResponseBody
    public String simpleGreeting() {
        return "Hello from Spring Boot! This is @ResponseBody working.";
    }

    @GetMapping("/greeting")
    public String greetingPage() {
        return "greeting";
    }
}
