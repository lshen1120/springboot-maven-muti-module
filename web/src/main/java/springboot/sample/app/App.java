package springboot.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(
        {
                @ComponentScan("springboot.sample.web"),
                @ComponentScan("springboot.sample.service")
        })
public class App {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(App.class, args);
    }
}