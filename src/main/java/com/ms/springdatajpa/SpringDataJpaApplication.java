package com.ms.springdatajpa;

import com.ms.springdatajpa.modal.Employee;
import com.ms.springdatajpa.modal.User;
import com.ms.springdatajpa.repository.EmployeeRepository;
import com.ms.springdatajpa.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository employeeRepository, UserRepository userRepository) {
        return (args) -> {
            saveEmployees(employeeRepository);
            saveUsers(userRepository);


            System.out.println(employeeRepository.findAll());
            System.out.println(userRepository.findAll());

            System.out.println(employeeRepository.findEmployeesByLastNameContaining(" "));
        };
    }

    private void saveEmployees(EmployeeRepository repository) {
        repository.save(new Employee("John", "Doe"));
        repository.save(new Employee("Bob", "Johnson"));
        repository.save(new Employee("Alice", "Jones"));
        repository.save(new Employee("David", "Lee"));
    }

    private void saveUsers(UserRepository repository){
        repository.save( new User("John Smith", "johnsmith@email.com", "password123", "555-555-5555", "123 Main St", "Anytown", "12345"));
        repository.save( new User("Jane Doe", "janedoe@email.com", "password456", "555-555-5555", "123 Elm St", "Anytown", "12345"));
        repository.save( new User("Mo", "mo@gmail.com", "password", "0791234567", "1 Parkway Drive", " London", "A7 7NY"));
        repository.save( new User("Bob Smith", "bobsmith@hotmail.com", "password789", "555-2468", "789 Elm St", "Nowhere", "54321"));

    }

}
