package com.viniciusgranatto.gestao_vagas.modules.main.factories.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.candidate.CreateCandidateDTO;
import com.viniciusgranatto.gestao_vagas.modules.presentation.controllers.candidate.CreateCandidateController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateFactory {
  
  @Autowired
  private CreateCandidateController createCandidateController;
  
  @PostMapping("/")
  public ResponseEntity<Object> create(@Valid @RequestBody CreateCandidateDTO createCandidateDTO) {
   
    return this.createCandidateController.create(createCandidateDTO);
  }
}
