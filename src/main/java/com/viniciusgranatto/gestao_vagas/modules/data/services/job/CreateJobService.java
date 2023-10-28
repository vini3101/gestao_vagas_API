package com.viniciusgranatto.gestao_vagas.modules.data.services.job;

import org.springframework.stereotype.Service;

import com.viniciusgranatto.gestao_vagas.modules.data.repositories.job.ICreateJobRepository;
import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.job.CreateJobDTO;
import com.viniciusgranatto.gestao_vagas.modules.domain.useCases.job.ICreateJob;

@Service
public class CreateJobService implements ICreateJob {
  private ICreateJobRepository createJobRepository;

  public CreateJobService(ICreateJobRepository createJobRepository) {
    this.createJobRepository = createJobRepository;
  }

  @Override
  public CreateJobDTO execute(CreateJobDTO createJobDTO) {    
    return this.createJobRepository.execute(createJobDTO);
  }
}
