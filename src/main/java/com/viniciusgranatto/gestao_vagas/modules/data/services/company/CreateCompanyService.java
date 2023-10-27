package com.viniciusgranatto.gestao_vagas.modules.data.services.company;

import org.springframework.stereotype.Service;

import com.viniciusgranatto.gestao_vagas.modules.data.repositories.company.ICreateCompanyRepository;
import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.company.CreateCompanyDTO;
import com.viniciusgranatto.gestao_vagas.modules.domain.useCases.company.ICreateCompany;

@Service
public class CreateCompanyService implements ICreateCompany{
  
  private ICreateCompanyRepository createCompanyRepository;

  public CreateCompanyService(ICreateCompanyRepository createCompanyRepository) {
    this.createCompanyRepository = createCompanyRepository;
  }

  @Override
  public CreateCompanyDTO execute(CreateCompanyDTO createCompanyDTO) {    
    return this.createCompanyRepository.execute(createCompanyDTO);
  }
}
