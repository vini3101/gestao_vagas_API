package com.viniciusgranatto.gestao_vagas.modules.main.factories;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viniciusgranatto.gestao_vagas.modules.data.services.candidate.CreateCandidateService;
import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.candidate.CreateCandidateDTO;

import com.viniciusgranatto.gestao_vagas.modules.infra.repositories.candidate.CreateCandidateRepository;
import com.viniciusgranatto.gestao_vagas.modules.presentation.controllers.candidate.CandidateController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CreateCandidateFactory {
  
  
  private CreateCandidateRepository createCandidateRepository = new CreateCandidateRepository();
  private CreateCandidateService createCandidateService = new CreateCandidateService(this.createCandidateRepository);
  private CandidateController candidateController = new CandidateController(this.createCandidateService);
  
  @PostMapping("/")
  public ResponseEntity<Object> create(@Valid @RequestBody CreateCandidateDTO createCandidateDTO) {
    return this.candidateController.create(createCandidateDTO);
  }
}
