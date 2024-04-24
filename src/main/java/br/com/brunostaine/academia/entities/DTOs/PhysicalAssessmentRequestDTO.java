package br.com.brunostaine.academia.entities.DTOs;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PhysicalAssessmentRequestDTO {
    private Long studentId;
    @Column(name = "current_weight")
    private double weight;
    @Column(name = "current_height")
    private double height;
}
