package br.com.brunostaine.academia.services;

import br.com.brunostaine.academia.entities.DTOs.PhysicalAssessmentRequestDTO;
import br.com.brunostaine.academia.entities.PhysicalAssessment;

import java.util.Optional;

public interface IPhysicalAssessment {
    PhysicalAssessment create(PhysicalAssessmentRequestDTO physicalAssessment);
    Optional<PhysicalAssessment> getById(Long id);
    void delete(Long id);
}
