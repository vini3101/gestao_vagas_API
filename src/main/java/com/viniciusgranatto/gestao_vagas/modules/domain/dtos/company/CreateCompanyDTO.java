package com.viniciusgranatto.gestao_vagas.modules.domain.dtos.company;

import lombok.Data;

@Data
public class CreateCompanyDTO {
  private String username;
  private String email;
  private String password;
  private String website;
  private String description;
  private String name;
}
