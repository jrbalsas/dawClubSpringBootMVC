package com.daw.clubspringboot;

import com.daw.clubspringboot.controller.ClienteController;
import com.daw.clubspringboot.model.Cliente;
import com.daw.clubspringboot.model.dao.ClienteDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.logging.Logger;

/** SpringBoot configuration class for deploying in JEE application server
 *
 * @author jrbalsas
 */
@SpringBootApplication
public class DawClubSpringBootMvcApplication  {

    private static final Logger logger = Logger.getLogger(ClienteController.class.getName());

    public static void main(String[] args) {
        //Application starting but context not available, i.e. Dependency Injection not allowed jet
        logger.info(">>>Inicializando aplicación");

        SpringApplication.run(DawClubSpringBootMvcApplication.class, args);
    }

    @Bean
    public CommandLineRunner initApp(@Qualifier("clienteDAOMap") ClienteDAO clienteDAO) {
        //execute code after the Spring application context has fully started but before the application itself begins running.
        return (args) -> {
            logger.info("Creando clientes de prueba");

            clienteDAO.crea( new Cliente(0, "Paco López", "11111111-A", false) );
            clienteDAO.crea( new Cliente(0, "María Jiménez", "22222222-B", true) );
            clienteDAO.crea( new Cliente(0, "Carlos García", "33333333-C", true) );
        };
    }

}
