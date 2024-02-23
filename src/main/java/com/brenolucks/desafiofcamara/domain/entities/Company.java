package com.brenolucks.desafiofcamara.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_company")
public class Company implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "The name field is mandatory.")
    private String name;
    @NotBlank(message = "The field CNPJ is mandatory.")
    private String cnpj;
    @NotBlank(message = "The field Address is mandatory.")
    private String address;
    @NotBlank(message = "The field Phone is mandatory.")
    private int phone;
    @NotBlank(message = "The field Amount Vacancy Motorcycle is mandatory.")
    private int amountVacancyMotorcycle;
    @NotBlank(message = "The field Amount Vacancy Car is mandatory.")
    private int amountVacancyCar;
    @OneToOne
    @JoinColumn(name = "vehicle_id", referencedColumnName = "id")
    private Vehicle vehicle;
}
