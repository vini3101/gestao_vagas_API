package com.viniciusgranatto.gestao_vagas.modules.presentation.controllers.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.viniciusgranatto.gestao_vagas.modules.data.services.job.CreateJobService;
import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.job.CreateJobDTO;

@Controller
public class CreateJobController {
  
  @Autowired
  private CreateJobService createJobService;

  public CreateJobController(CreateJobService createJobService) {
    this.createJobService = createJobService;
  }

  public ResponseEntity<Object> create(CreateJobDTO createJobDTO) {
    try{
      var jobCreated = this.createJobService.execute(createJobDTO);
      return ResponseEntity.ok(jobCreated);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}
