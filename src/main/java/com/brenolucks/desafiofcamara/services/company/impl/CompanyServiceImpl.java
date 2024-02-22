package com.brenolucks.desafiofcamara.services.company.impl;

import com.brenolucks.desafiofcamara.domain.entities.Company;
import com.brenolucks.desafiofcamara.repositories.company.CompanyRepository;
import com.brenolucks.desafiofcamara.repositories.vehicle.VehicleRepository;
import com.brenolucks.desafiofcamara.services.company.CompanyService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    @Override
    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company updateCompany(Company company, Long id){
        Company updateCompany = companyRepository.findById(id).get();
        updateCompany.setName(company.getName());
        updateCompany.setCnpj(company.getCnpj());
        updateCompany.setAddress(company.getAddress());
        updateCompany.setPhone(company.getPhone());
        updateCompany.setAmountVacancyCar(company.getAmountVacancyCar());
        updateCompany.setAmountVacancyMotorcycle(company.getAmountVacancyMotorcycle());

        return companyRepository.save(updateCompany);
    }

    @Override
    public List<Company> listAllCompany(){
        return companyRepository.findAll();
    }

    @Override
    public Optional<Company> listCompanyById(Long id){
        return Optional.ofNullable(companyRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Company inexistent! ID: " + id)));
    }
}
