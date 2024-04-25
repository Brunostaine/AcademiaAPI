package br.com.brunostaine.academia.services.impl;


import br.com.brunostaine.academia.controllers.dtos.PhysicalAssessmentRequestDTO;
import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.entities.Student;
import br.com.brunostaine.academia.exceptions.EntityNotFoundException;
import br.com.brunostaine.academia.repositories.PhysicalAssessmentRepository;
import br.com.brunostaine.academia.repositories.StudentRepository;
import br.com.brunostaine.academia.services.IPhysicalAssessment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Slf4j
@Service
@RequiredArgsConstructor
public class PhysicalAssessmentServiceImpl implements IPhysicalAssessment {
    private final PhysicalAssessmentRepository physicalAssessmentRepository;
    private final StudentRepository studentRepository;

    @Override
    public PhysicalAssessment create(PhysicalAssessment assessment) {
            Student student = studentRepository.findById(assessment.getId()).orElseThrow();
            PhysicalAssessment newAssessment = new PhysicalAssessment();

            newAssessment.setStudent(student);
            newAssessment.setWeight(assessment.getWeight());
            newAssessment.setHeight(assessment.getHeight());
            return physicalAssessmentRepository.save(newAssessment);
    }


    @Override
    public PhysicalAssessment getById(Long id) {
        return physicalAssessmentRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        try {
            physicalAssessmentRepository.deleteById(id);
        } catch (EntityNotFoundException ex) {
            throw new EntityNotFoundException("physicalAssessment not found! " + id);
        }
    }
}
