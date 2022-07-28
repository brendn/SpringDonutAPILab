package dog.brendan.donutapi;

import dog.brendan.donutapi.api.service.DonutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DonutController {

    @Autowired
    private DonutService donutService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("donuts", donutService.getDonuts());
        return "home";
    }

    @RequestMapping("donut")
    public String donut(Model model, @RequestParam int id) {
        model.addAttribute("donut", donutService.getDonutinfo(id));
        return "donut";
    }
}
