package br.com.brunostaine.academia.controllers.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PhysicalAssessmentRequestDTO {
    private Long studentId;
    @Column(name = "current_weight")
    private double weight;
    @Column(name = "current_height")
    private double height;
}
