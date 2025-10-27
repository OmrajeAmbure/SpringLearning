package MVCConfiguration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView home() {
        // ModelAndView object holds both the view name and data to be passed to the view
        ModelAndView mav = new ModelAndView("home");
        // Adding data ("message") to be displayed on the view
        mav.addObject("message", "Welcome to Spring MVC with Java Config and XML Config!");
        return mav;
    }
}
