package com.brenolucks.desafiofcamara.services.company;

import com.brenolucks.desafiofcamara.domain.entities.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    Company createCompany(Company company);
    Company updateCompany(Company company, Long id);
    List<Company> listAllCompany();
    Optional<Company> listCompanyById(Long id);
}
