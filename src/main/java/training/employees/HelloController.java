package training.employees;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
@AllArgsConstructor
public class HelloController {

    private HelloService helloService;

/*    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }
*/
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        //return "Hello! " + LocalDateTime.now();

        return helloService.sayHello();
    }

}
