package com.brenolucks.desafiofcamara.repositories.company;

import com.brenolucks.desafiofcamara.domain.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
