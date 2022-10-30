package clase.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    private final Models m; //instanciamos la clase modelo
    public Controller(){
        m = new Models(); //la iniciamo

    }
    @GetMapping("/")
    public String index(Model model){
        m.consumirCita(); //realizamos un consumo de cita
        model.addAttribute("cita", m.getCita()); // solicitamos la cita al modelo y la agregamos a los datos que mandamos a la vista

        return "index"; //el return indica que vista renderizar
    }
}
