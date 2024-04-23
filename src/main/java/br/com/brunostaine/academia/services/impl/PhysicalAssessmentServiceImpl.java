package br.com.brunostaine.academia.services.impl;


import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.entities.Student;
import br.com.brunostaine.academia.exceptions.EntityNotFoundException;
import br.com.brunostaine.academia.repositories.PhysicalAssessmentRepository;
import br.com.brunostaine.academia.repositories.StudentRepository;
import br.com.brunostaine.academia.services.IPhysicalAssessment;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
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
    public PhysicalAssessment create(PhysicalAssessment physicalAssessment) {
        try{
            PhysicalAssessment newAssessment = new PhysicalAssessment();
            Student student = studentRepository.findById(physicalAssessment.getId()).get();

            newAssessment.setStudent(student); // TODO Criar um DTO de avaliação fisica
            newAssessment.setWeight(physicalAssessment.getWeight());
            newAssessment.setHeight(physicalAssessment.getHeight());
            return physicalAssessmentRepository.save(newAssessment);
        }
        catch (RuntimeException ex){
            throw new EntityNotFoundException("Not found! " + ex);
        }
    }

    @Override
    public Optional<PhysicalAssessment> getById(Long id) {
        try {
            return physicalAssessmentRepository.findById(id);
        } catch (EntityNotFoundException ex) {
            throw new EntityNotFoundException("physicalAssessment not found! " + id);
        }
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
