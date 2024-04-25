package br.com.brunostaine.academia.controllers.dtos;

import br.com.brunostaine.academia.entities.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationResponseDTO {
    private Long registration;
    private Student student;
}
