package com.brenolucks.desafiofcamara.controllers.company;

import com.brenolucks.desafiofcamara.domain.entities.Company;
import com.brenolucks.desafiofcamara.services.company.CompanyService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/company")
    public ResponseEntity<Company> createCompany(@RequestBody @Valid Company company) {
        return ResponseEntity.status(HttpStatus.CREATED).body(companyService.createCompany(company));
    }
    @PutMapping("/company/{id}")
    public ResponseEntity<Company> updateCompany(@RequestBody @Valid Company company, @PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.updateCompany(company, id));
    }

    @GetMapping("/company")
    public ResponseEntity<List<Company>> listAllCompany(){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.listAllCompany());
    }

    @GetMapping("/company/{id}")
    public ResponseEntity<Optional<Company>> listCompanyById(Long id){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.listCompanyById(id));
    }
}
