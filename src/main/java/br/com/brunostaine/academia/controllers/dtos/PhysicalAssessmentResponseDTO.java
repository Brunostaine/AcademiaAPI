package br.com.brunostaine.academia.controllers.dtos;

import br.com.brunostaine.academia.entities.Student;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalAssessmentResponseDTO {
    private Long studentId;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime evaluationDate = LocalDateTime.now();

    private double weight;

    private double height;
}
