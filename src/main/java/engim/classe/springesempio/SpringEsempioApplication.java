package engim.classe.springesempio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringEsempioApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEsempioApplication.class, args);
    }

}
