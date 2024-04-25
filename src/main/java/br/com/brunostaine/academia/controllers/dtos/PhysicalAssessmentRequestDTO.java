package br.com.brunostaine.academia.controllers.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PhysicalAssessmentRequestDTO {
    private Long studentId;
    @Column(name = "current_weight")
    private double weight;
    @Column(name = "current_height")
    private double height;
}
