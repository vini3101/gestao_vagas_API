package com.viniciusgranatto.gestao_vagas.modules.infra.jpa_repositories.candidate;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusgranatto.gestao_vagas.modules.infra.entities.candidate.CandidateEntity;

public interface CandidateJPARepository extends JpaRepository<CandidateEntity, UUID>{

}
