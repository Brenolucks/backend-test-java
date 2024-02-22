package com.brenolucks.desafiofcamara.repositories.vehicle;

import com.brenolucks.desafiofcamara.domain.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
