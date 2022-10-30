package clase.Api;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@Data //automaticamente genera getter setters y constructor
public class Models { // aca realizamos el consumo de la API, es en Modelo como si consumieramos un base de datos
    private Cita cita; //objeto cita para almacenar la cita q viene por api
    private String URL_API = "https://programming-quotes-api.herokuapp.com/quotes/random"; //URL de la api

    @Autowired
    public void consumirCita(){
        RestTemplate rs = new RestTemplate(); // Nuevo objeto que realiza el consumo de la api
        cita = rs.getForObject(URL_API, Cita.class); //Consumimos la api y la almacenamos automaticamente en un OBJETO
        System.out.println(cita); // imprimimos por consola para debuggear

    }
}
