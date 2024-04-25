package br.com.brunostaine.academia.services.impl;


import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.entities.Student;
import br.com.brunostaine.academia.exceptions.EntityNotFoundException;
import br.com.brunostaine.academia.repositories.PhysicalAssessmentRepository;
import br.com.brunostaine.academia.repositories.StudentRepository;
import br.com.brunostaine.academia.services.IPhysicalAssessment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PhysicalAssessmentServiceImpl implements IPhysicalAssessment {
    private final PhysicalAssessmentRepository physicalAssessmentRepository;
    private final StudentRepository studentRepository;

    @Override
    @Transactional
    public PhysicalAssessment create(PhysicalAssessment assessment) {
        Student student = studentRepository.findById(assessment.getId()).orElseThrow();
        PhysicalAssessment newAssessment = new PhysicalAssessment();

        newAssessment.setStudent(student);
        newAssessment.setWeight(assessment.getWeight());
        newAssessment.setHeight(assessment.getHeight());
        return physicalAssessmentRepository.save(newAssessment);
    }


    @Override
    @Transactional(readOnly = true)
    public PhysicalAssessment getById(Long id) {
        return physicalAssessmentRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(String.format("Physical Assessment not found! " + id))
        );
    }

    @Override
    @Transactional(readOnly = true)
    public void delete(Long id) {
        try {
            physicalAssessmentRepository.deleteById(id);
        } catch (EntityNotFoundException ex) {
            throw new EntityNotFoundException("Physical Assessment not found! " + id);
        }
    }
}
