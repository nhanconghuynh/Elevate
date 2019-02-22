import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(){
        return "index";
    }
    @GetMapping("/AboutBootCamp")
    public String bootCamp(){
        return "AboutBootCamp";
    }
    @GetMapping("/AboutDeveloper")
    public String developer(){
        return "AboutDeveloper";
    }

}
