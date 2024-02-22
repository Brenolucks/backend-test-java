package com.brenolucks.desafiofcamara.controllers.vehicle;

import com.brenolucks.desafiofcamara.domain.entities.Vehicle;
import com.brenolucks.desafiofcamara.services.vehicle.VehicleService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping("/vehicle")
    public ResponseEntity<Vehicle> createCompany(@RequestBody @Valid Vehicle vehicle) {
        return ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.createVehicle(vehicle));
    }
    @PutMapping("/vehicle/{id}")
    public ResponseEntity<Vehicle> updateVehicle(@RequestBody @Valid Vehicle vehicle, @PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(vehicleService.updateVehicle(vehicle, id));
    }

    @GetMapping("/vehicle")
    public ResponseEntity<List<Vehicle>> listAllCompany(){
        return ResponseEntity.status(HttpStatus.OK).body(vehicleService.listAllVehicle());
    }

    @GetMapping("/vehicle/{id}")
    public ResponseEntity<Optional<Vehicle>> listVehicleById(Long id){
        return ResponseEntity.status(HttpStatus.OK).body(vehicleService.listVehicleById(id));
    }
}
