package br.com.brunostaine.academia.services;

import br.com.brunostaine.academia.entities.PhysicalAssessment;

import java.util.List;

public interface IPhysicalAssessment {
    PhysicalAssessment create(PhysicalAssessment physicalAssessment);
    PhysicalAssessment getById(Long id);
    List<PhysicalAssessment> getAll();
    PhysicalAssessment update(Long id, PhysicalAssessment physicalAssessment);
    void delete(Long id);
}
