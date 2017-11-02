package dk.dat16j.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Chris on 02-Nov-17.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "<h1>Hello world</h1>";
    }
}
