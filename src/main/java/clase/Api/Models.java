package clase.Api;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@Data
public class Models {
    private Cita cita;
    private String URL_API = "https://programming-quotes-api.herokuapp.com/quotes/random";

    @Autowired
    public void consumirCita(){
        RestTemplate rs = new RestTemplate();
        cita = rs.getForObject(URL_API, Cita.class);
        System.out.println(cita);

    }
}
