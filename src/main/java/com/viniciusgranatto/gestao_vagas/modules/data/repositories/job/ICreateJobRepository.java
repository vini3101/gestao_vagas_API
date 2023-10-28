package com.viniciusgranatto.gestao_vagas.modules.data.repositories.job;

import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.job.CreateJobDTO;

public interface ICreateJobRepository {
  CreateJobDTO execute(CreateJobDTO createJobDTO);
}
