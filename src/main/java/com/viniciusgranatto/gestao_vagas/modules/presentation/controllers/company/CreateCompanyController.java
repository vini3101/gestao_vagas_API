package com.viniciusgranatto.gestao_vagas.modules.presentation.controllers.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.viniciusgranatto.gestao_vagas.modules.data.services.company.CreateCompanyService;
import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.company.CreateCompanyDTO;
import com.viniciusgranatto.gestao_vagas.modules.domain.exceptions.company.CompanyFoundException;

@Controller
public class CreateCompanyController {
  
  @Autowired
  private CreateCompanyService createCompanyService;

  public CreateCompanyController(CreateCompanyService createCompanyService) {
    this.createCompanyService = createCompanyService;
  }

  public ResponseEntity<Object> create(CreateCompanyDTO createCompanyDTO) {
    try{
      var companyCreated = this.createCompanyService.execute(createCompanyDTO);
      return ResponseEntity.ok(companyCreated);
    } catch (CompanyFoundException e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}
