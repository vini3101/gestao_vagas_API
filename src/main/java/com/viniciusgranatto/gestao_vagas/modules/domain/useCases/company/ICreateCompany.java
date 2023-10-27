package com.viniciusgranatto.gestao_vagas.modules.domain.useCases.company;

import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.company.CreateCompanyDTO;

public interface ICreateCompany {
  CreateCompanyDTO execute(CreateCompanyDTO createCompanyDTO);
}
