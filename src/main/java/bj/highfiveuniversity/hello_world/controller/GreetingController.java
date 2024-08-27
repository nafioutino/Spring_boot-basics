import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequesParam;
import bj.highfiveuniversity.greeting.model.Greeting;
@RestController
public class GreetingController {
    @GetMapping("/")
    public Greeting getMethodName(){
        return new Greeting(1, "Hello world");
    }
    
}
