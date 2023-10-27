package com.viniciusgranatto.gestao_vagas.modules.domain.exceptions.company;

public class CompanyFoundException extends RuntimeException{
  public CompanyFoundException() {
    super("Company already exists");
  }
}
