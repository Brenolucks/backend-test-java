package com.brenolucks.desafiofcamara.services.vehicle;

import com.brenolucks.desafiofcamara.domain.entities.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {
    Vehicle createVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Vehicle vehicle, Long id);
    List<Vehicle> listAllVehicle();
    Optional<Vehicle> listVehicleById(Long id);
}
