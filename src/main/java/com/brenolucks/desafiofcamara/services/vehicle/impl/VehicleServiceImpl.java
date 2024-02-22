package com.brenolucks.desafiofcamara.services.vehicle.impl;

import com.brenolucks.desafiofcamara.domain.entities.Vehicle;
import com.brenolucks.desafiofcamara.repositories.vehicle.VehicleRepository;
import com.brenolucks.desafiofcamara.services.vehicle.VehicleService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }
    @Override
    public Vehicle updateVehicle(Vehicle vehicle, Long id){
        Vehicle updateVehicle = vehicleRepository.findById(id).get();
        updateVehicle.setBrand(vehicle.getBrand());
        updateVehicle.setModel(vehicle.getModel());
        updateVehicle.setColor(vehicle.getColor());
        updateVehicle.setPlate(vehicle.getPlate());
        updateVehicle.setType(vehicle.getType());

        return vehicleRepository.save(updateVehicle);
    }

    @Override
    public List<Vehicle> listAllVehicle(){
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> listVehicleById(Long id){
        return Optional.ofNullable(vehicleRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Vehicle inexistent! ID: " + id)));
    }
}
