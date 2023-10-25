package com.viniciusgranatto.gestao_vagas.modules.presentation.controllers.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.viniciusgranatto.gestao_vagas.modules.data.services.candidate.CreateCandidateService;
import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.candidate.CreateCandidateDTO;
import com.viniciusgranatto.gestao_vagas.modules.domain.exceptions.candidate.CandidateFoundException;

@Controller
public class CandidateController {
  
  @Autowired
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