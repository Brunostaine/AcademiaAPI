package br.com.brunostaine.academia.controllers.dtos;

import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.entities.Registration;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseDTO {
    private Long id;
    private String name;
    private String cpf;
    private String city;
    private String birthDate;
    private List<PhysicalAssessment> assessments = new ArrayList<>();
    private Registration registration;
}
