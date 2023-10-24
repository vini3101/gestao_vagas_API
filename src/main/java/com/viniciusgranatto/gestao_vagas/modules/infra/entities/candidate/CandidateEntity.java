package com.viniciusgranatto.gestao_vagas.modules.infra.entities.candidate;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "candidate")
public class CandidateEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String name;

  @NotBlank(message = "Username cannot be blank")
  @Pattern(regexp = "^(?!\\s*$).+", message = "Username cannot have space")
  private String username;

  @Email(message = "Email should be vsalid")
  private String email;

  @Length(min = 8, message = "Password should have at least 8 characters")
  private String password;

  private String curriculum;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
