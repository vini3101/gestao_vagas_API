package com.viniciusgranatto.gestao_vagas.modules.infra.jpa_repositories.job;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusgranatto.gestao_vagas.modules.infra.entities.job.JobEntity;

public interface JobJPARepository extends JpaRepository<JobEntity, UUID>{
  
}
