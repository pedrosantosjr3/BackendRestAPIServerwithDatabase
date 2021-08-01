package employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            EmployeeRepository repository) {
        return args -> {
            Employee pedro = new Employee(
                    "Pedro",
                    "rt.pedrosantos@gmail.com",
                    LocalDate.of(1991, Month.JUNE, 21)
            );

            Employee julian = new Employee(
                    "Julian",
                    "jdribble84@yahoo.com",
                    LocalDate.of(1991, Month.OCTOBER, 31)
            );

            repository.saveAll(
                    List.of(pedro, julian)
            );

        };
    }
}
