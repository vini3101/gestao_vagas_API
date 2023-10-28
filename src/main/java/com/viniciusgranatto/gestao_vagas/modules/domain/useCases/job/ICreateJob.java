package com.viniciusgranatto.gestao_vagas.modules.domain.useCases.job;

import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.job.CreateJobDTO;

public interface ICreateJob {
  CreateJobDTO execute(CreateJobDTO createJobDTO);
}
