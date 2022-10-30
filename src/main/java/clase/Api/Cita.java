package clase.Api;

import lombok.Data;

@Data
public class Cita {    //objeto de cita donde almacenamos lo que consumimos de la API
    private String id; //exactamente los mismos nombres que los campos del consumo de la aip
    private String author; //creo que podemos omitir los que no vamos a usar
    private String en; //en este caso usamos todos

}
//ejemplo dato que viene de la api
//{"id":"5a9912938cdbad0004955d04","author":"Gordon Bell","en":"The cheapest, fastest, and most reliable components are those that aren’t there."}
