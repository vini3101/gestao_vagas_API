package com.viniciusgranatto.gestao_vagas.modules.infra.repositories.candidate;

import org.springframework.beans.factory.annotation.Autowired;

import com.viniciusgranatto.gestao_vagas.modules.data.repositories.candidate.ICreateCandidateRepository;
import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.candidate.CreateCandidateDTO;
import com.viniciusgranatto.gestao_vagas.modules.infra.entities.candidate.CandidateEntity;
import com.viniciusgranatto.gestao_vagas.modules.infra.jpa_repositories.candidate.CandidateRepository;

public class CreateCandidateRepository implements ICreateCandidateRepository {
  @Autowired
  private CandidateRepository candidateRepository;

  public CreateCandidateDTO execute(CreateCandidateDTO createCandidateDTO) {
    CandidateEntity candidateEntity = new CandidateEntity();
    candidateEntity.setName(createCandidateDTO.getName());
    candidateEntity.setUsername(createCandidateDTO.getUsername());
    candidateEntity.setEmail(createCandidateDTO.getEmail());
    candidateEntity.setPassword(createCandidateDTO.getPassword());
    candidateEntity.setCurriculum(createCandidateDTO.getCurriculum());
  
    var createdCandidateEntity = this.candidateRepository.save(candidateEntity);

    CreateCandidateDTO createdCandidateDTO = new CreateCandidateDTO();
    createdCandidateDTO.setName(createdCandidateEntity.getName());
    createdCandidateDTO.setUsername(createdCandidateEntity.getUsername());
    createdCandidateDTO.setEmail(createdCandidateEntity.getEmail());
    createdCandidateDTO.setPassword(createdCandidateEntity.getPassword());
    createdCandidateDTO.setCurriculum(createdCandidateEntity.getCurriculum());

    return createdCandidateDTO;
  }
}
