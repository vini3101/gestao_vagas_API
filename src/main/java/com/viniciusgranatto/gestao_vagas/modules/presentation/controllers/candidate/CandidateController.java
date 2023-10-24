package com.viniciusgranatto.gestao_vagas.modules.presentation.controllers.candidate;

import org.springframework.http.ResponseEntity;


import com.viniciusgranatto.gestao_vagas.modules.data.services.candidate.CreateCandidateService;
import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.candidate.CreateCandidateDTO;
import com.viniciusgranatto.gestao_vagas.modules.domain.exceptions.candidate.CandidateFoundException;

public class CandidateController {
  
  private CreateCandidateService createCandidateService;

  public CandidateController(CreateCandidateService createCandidateService) {
    this.createCandidateService = createCandidateService;
  }

  public ResponseEntity<Object> create(CreateCandidateDTO candidateDTO) {
    try{
      var candidateCreated = this.createCandidateService.execute(candidateDTO);
      return ResponseEntity.ok(candidateCreated);
    } catch (CandidateFoundException e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}