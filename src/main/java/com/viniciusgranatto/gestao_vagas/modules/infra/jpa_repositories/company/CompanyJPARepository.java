package com.viniciusgranatto.gestao_vagas.modules.infra.jpa_repositories.company;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusgranatto.gestao_vagas.modules.infra.entities.company.CompanyEntity;

public interface CompanyJPARepository extends JpaRepository<CompanyEntity, UUID>{
  
}
