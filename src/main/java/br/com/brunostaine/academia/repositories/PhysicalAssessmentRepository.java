package br.com.brunostaine.academia.repositories;

import br.com.brunostaine.academia.entities.PhysicalAssessment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicalAssessmentRepository extends JpaRepository<PhysicalAssessment, Long> {
}
