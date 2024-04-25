package br.com.brunostaine.academia.services;

import br.com.brunostaine.academia.controllers.dtos.PhysicalAssessmentRequestDTO;
import br.com.brunostaine.academia.entities.PhysicalAssessment;

import java.util.Optional;

public interface IPhysicalAssessment {
    PhysicalAssessment create(PhysicalAssessment physicalAssessment);
    PhysicalAssessment getById(Long id);
    void delete(Long id);
}
