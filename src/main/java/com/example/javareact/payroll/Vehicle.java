package com.example.javareact.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Vehicle {

    private @Id @GeneratedValue  Long id;
    private String model;
    private String description;

    public Vehicle() {
    }

    public Vehicle(String model, String description) {
        this.model = model;
        this.description = description;
    }
}
