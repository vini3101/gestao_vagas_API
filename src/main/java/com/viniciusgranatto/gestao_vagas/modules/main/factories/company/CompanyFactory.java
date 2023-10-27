package com.viniciusgranatto.gestao_vagas.modules.main.factories.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.company.CreateCompanyDTO;
import com.viniciusgranatto.gestao_vagas.modules.presentation.controllers.company.CreateCompanyController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/company")
public class CompanyFactory {
  
  @Autowired
  private CreateCompanyController createCompanyController;

  @PostMapping("/")
  public ResponseEntity<Object> create(@Valid @RequestBody CreateCompanyDTO createCompanyDTO) {
   
    return this.createCompanyController.create(createCompanyDTO);
  }
}
