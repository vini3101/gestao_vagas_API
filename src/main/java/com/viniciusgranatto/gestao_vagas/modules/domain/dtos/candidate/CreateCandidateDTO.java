package com.viniciusgranatto.gestao_vagas.modules.domain.dtos.candidate;

import lombok.Data;

@Data
public class CreateCandidateDTO {
  private String name;
  private String username;
  private String email;
  private String password;
  private String curriculum;
}
