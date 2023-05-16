package Pr13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class app {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(app.class, args);

        StudentConfiguration student = ctx.getBean(StudentConfiguration.class);


    }
}
