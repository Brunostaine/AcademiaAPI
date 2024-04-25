package br.com.brunostaine.academia.controllers.dtos;

import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.entities.Registration;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDTO {
    @NotBlank
    @Size(min = 3, max = 100)
    private String name;
    @Size(min = 11, max = 11)
    @CPF
    private String cpf;
    @NotBlank
    @Size(min = 3, max = 50)
    private String city;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<PhysicalAssessment> assessments = new ArrayList<>();
    private Registration registration;
}
