package com.viniciusgranatto.gestao_vagas.modules.infra.repositories.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.viniciusgranatto.gestao_vagas.modules.data.repositories.job.ICreateJobRepository;
import com.viniciusgranatto.gestao_vagas.modules.domain.dtos.job.CreateJobDTO;
import com.viniciusgranatto.gestao_vagas.modules.infra.entities.job.JobEntity;
import com.viniciusgranatto.gestao_vagas.modules.infra.jpa_repositories.job.JobJPARepository;

@Repository
public class CreateJobRepository implements ICreateJobRepository {
  
  @Autowired
  private JobJPARepository jobJPARepository;

  @Override
  public CreateJobDTO execute(CreateJobDTO createJobDTO) {
    JobEntity jobEntity = new JobEntity();
    jobEntity.setDescription(createJobDTO.getDescription());
    jobEntity.setBenefits(createJobDTO.getBenefits());
    jobEntity.setCompanyId(createJobDTO.getCompanyId());
    jobEntity.setLevel(createJobDTO.getLevel());

    var createdJobEntity = this.jobJPARepository.save(jobEntity);

    CreateJobDTO createdJobDTO = new CreateJobDTO();
    createdJobDTO.setDescription(createdJobEntity.getDescription());
    createdJobDTO.setBenefits(createdJobEntity.getBenefits());
    createdJobDTO.setCompanyId(createdJobEntity.getCompanyId());
    createdJobDTO.setLevel(createdJobEntity.getLevel());

    return createdJobDTO;
  }
}
