package com.example.javareact.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner{

    private final EmployeeRepository employeeRepository;
    private final VehicleRepository vehicleRepository;


    @Autowired
    public DatabaseLoader(EmployeeRepository employeeRepository, VehicleRepository vehicleRepository) {
        this.employeeRepository = employeeRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.employeeRepository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.vehicleRepository.save(new Vehicle("Toyota Camry", "Blue, 2016"));
    }

}
