package Pr13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentConfiguration {
    @Bean
    @Scope("singleton")
    Student getStudent(){
        return new Student();
    }
}
