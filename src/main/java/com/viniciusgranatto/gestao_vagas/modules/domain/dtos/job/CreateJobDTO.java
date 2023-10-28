package com.viniciusgranatto.gestao_vagas.modules.domain.dtos.job;

import java.util.UUID;

import lombok.Data;

@Data
public class CreateJobDTO {
  private String description;
  private String benefits;
  private String level;
  private UUID companyId;
}
