package com.viniciusgranatto.gestao_vagas.modules.domain.useCases.candidate;

import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.candidate.CreateCandidateDTO;

public interface ICreateCandidate {
  CreateCandidateDTO execute(CreateCandidateDTO createCandidateDTO);
}
