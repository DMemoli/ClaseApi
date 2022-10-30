package clase.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    private final Models m;
    public Controller(){
        m = new Models();

    }
    @GetMapping("/")
    public String index(Model model){
        m.consumirCita();
        Cita c = m.getCita();
        model.addAttribute("cita", c);

        return "index";
    }
}
