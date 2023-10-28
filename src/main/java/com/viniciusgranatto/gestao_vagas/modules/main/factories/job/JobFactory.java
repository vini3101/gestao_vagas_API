package com.viniciusgranatto.gestao_vagas.modules.main.factories.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.job.CreateJobDTO;
import com.viniciusgranatto.gestao_vagas.modules.presentation.controllers.job.CreateJobController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/job")
public class JobFactory {
  
  @Autowired
  private CreateJobController createJobController;

  @PostMapping("/")
  public ResponseEntity<Object> create(@Valid @RequestBody CreateJobDTO createJobDTO) {
    
    return this.createJobController.create(createJobDTO);
  }
}
