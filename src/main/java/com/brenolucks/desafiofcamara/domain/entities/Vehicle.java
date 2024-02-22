package com.brenolucks.desafiofcamara.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_vehicle")
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "The field Brand is mandatory.")
    private String brand;
    @NotBlank(message = "The field Model is mandatory.")
    private String model;
    @NotBlank(message = "The field Color is mandatory.")
    private String color;
    @NotBlank(message = "The field Plate is mandatory.")
    private String plate;
    @NotBlank(message = "The field Type is mandatory.")
    private String type;
}
