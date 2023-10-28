package com.viniciusgranatto.gestao_vagas.modules.infra.repositories.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.viniciusgranatto.gestao_vagas.modules.data.repositories.company.ICreateCompanyRepository;
import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.company.CreateCompanyDTO;
import com.viniciusgranatto.gestao_vagas.modules.infra.entities.company.CompanyEntity;
import com.viniciusgranatto.gestao_vagas.modules.infra.jpa_repositories.company.CompanyJPARepository;

@Repository
public class CreateCompanyRepository implements ICreateCompanyRepository {
  
  @Autowired
  private CompanyJPARepository companyJPARepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  public CreateCompanyDTO execute(CreateCompanyDTO createCompanyDTO) {
    CompanyEntity companyEntity = new CompanyEntity();
    companyEntity.setUsername(createCompanyDTO.getUsername());
    companyEntity.setEmail(createCompanyDTO.getEmail());
    companyEntity.setPassword(passwordEncoder.encode(createCompanyDTO.getPassword()));
    companyEntity.setName(createCompanyDTO.getName());
    companyEntity.setWebsite(createCompanyDTO.getWebsite());
    companyEntity.setDescription(createCompanyDTO.getDescription());

    var createdCompanyEntity = this.companyJPARepository.save(companyEntity);

    CreateCompanyDTO createdCompanyDTO = new CreateCompanyDTO();
    createdCompanyDTO.setUsername(createdCompanyEntity.getUsername());
    createdCompanyDTO.setEmail(createdCompanyEntity.getEmail());
    createdCompanyDTO.setPassword(createdCompanyEntity.getPassword());
    createdCompanyDTO.setName(createdCompanyEntity.getName());
    createdCompanyDTO.setWebsite(createdCompanyEntity.getWebsite());
    createdCompanyDTO.setDescription(createdCompanyEntity.getDescription());

    return createdCompanyDTO;
  }
}
