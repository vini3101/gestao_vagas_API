package com.viniciusgranatto.gestao_vagas.modules.data.repositories.candidate;

import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.candidate.CreateCandidateDTO;

public interface ICreateCandidateRepository {
  CreateCandidateDTO execute(CreateCandidateDTO createCandidateDTO);
}
