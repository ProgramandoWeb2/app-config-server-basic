package pe.edu.cibertec.app_config_server_basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AppConfigServerBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppConfigServerBasicApplication.class, args);
	}

}
