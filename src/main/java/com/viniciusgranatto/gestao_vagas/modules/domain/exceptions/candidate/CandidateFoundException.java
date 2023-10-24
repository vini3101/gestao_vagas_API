package com.viniciusgranatto.gestao_vagas.modules.domain.exceptions.candidate;

public class CandidateFoundException extends RuntimeException {
  public CandidateFoundException() {
    super("Candidate already exists");
  }
}
