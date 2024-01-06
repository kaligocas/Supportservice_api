package supportApi_rest.support_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SupportAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupportAppApplication.class, args);
	}

}
