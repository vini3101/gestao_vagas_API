package com.viniciusgranatto.gestao_vagas.modules.data.services.candidate;

import com.viniciusgranatto.gestao_vagas.modules.data.repositories.candidate.ICreateCandidateRepository;
import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.candidate.CreateCandidateDTO;
import com.viniciusgranatto.gestao_vagas.modules.domain.useCases.candidate.ICreateCandidate;

public class CreateCandidateService implements ICreateCandidate {
  private ICreateCandidateRepository createCandidateRepository;

  public CreateCandidateService(ICreateCandidateRepository createCandidateRepository) {
    this.createCandidateRepository = createCandidateRepository;
  }

  public CreateCandidateDTO execute(CreateCandidateDTO createCandidateDTO) {    
    return this.createCandidateRepository.execute(createCandidateDTO);
  }
}
