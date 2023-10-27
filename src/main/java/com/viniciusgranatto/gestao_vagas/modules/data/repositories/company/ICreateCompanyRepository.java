package com.viniciusgranatto.gestao_vagas.modules.data.repositories.company;

import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.company.CreateCompanyDTO;

public interface ICreateCompanyRepository {
  CreateCompanyDTO execute(CreateCompanyDTO createCompanyDTO);
}
