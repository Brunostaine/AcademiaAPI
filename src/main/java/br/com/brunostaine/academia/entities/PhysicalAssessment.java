package br.com.brunostaine.academia.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "physical_assessment")
public class PhysicalAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime evaluationDate = LocalDateTime.now();
    @Column(name = "current_weight")
    private double weight;
    @Column(name = "current_height")
    private double height;
}
