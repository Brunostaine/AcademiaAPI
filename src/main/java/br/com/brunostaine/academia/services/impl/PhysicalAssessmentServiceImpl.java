package br.com.brunostaine.academia.services.impl;


import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.repositories.PhysicalAssessmentRepository;
import br.com.brunostaine.academia.repositories.StudentRepository;
import br.com.brunostaine.academia.services.IPhysicalAssessment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhysicalAssessmentServiceImpl implements IPhysicalAssessment {
    private final PhysicalAssessmentRepository physicalAssessmentRepository;
    private final StudentRepository studentRepository;

    @Override
    public PhysicalAssessment create(PhysicalAssessment physicalAssessment) {
        return null;
    }

    @Override
    public PhysicalAssessment getById(Long id) {
        return null;
    }

    @Override
    public List<PhysicalAssessment> getAll() {
        return null;
    }

    @Override
    public PhysicalAssessment update(Long id, PhysicalAssessment physicalAssessment) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
