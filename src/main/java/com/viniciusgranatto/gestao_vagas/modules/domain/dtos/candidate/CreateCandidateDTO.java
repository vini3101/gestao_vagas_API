package com.viniciusgranatto.gestao_vagas.modules.domain.dtos.candidate;

public class CreateCandidateDTO {
  private String name;
  private String username;
  private String email;
  private String password;
  private String curriculum;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCurriculum() {
    return this.curriculum;
  }

  public void setCurriculum(String curriculum) {
    this.curriculum = curriculum;
  }
}