package clase.Api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);  //Basicamente lo que inicia spring, ya viene pre cargado
		//Models m = new Models(); //para probar la el consumo de api
		//m.consumirCita(); //idem
	}

}
