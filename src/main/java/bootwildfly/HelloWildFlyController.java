package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hola")
    public String sayHello(){
        return ("Spring boot a Wildfly. Hola!");
    }
}