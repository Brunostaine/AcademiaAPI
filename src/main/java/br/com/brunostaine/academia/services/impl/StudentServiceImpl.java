package br.com.brunostaine.academia.services.impl;

import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.entities.Student;
import br.com.brunostaine.academia.repositories.RegistrationRepository;
import br.com.brunostaine.academia.repositories.StudentRepository;
import br.com.brunostaine.academia.services.IStudent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudent {
    private final StudentRepository studentRepository;
    private final RegistrationRepository registrationRepository;

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student getById(Long id) {
        return null;
    }

    @Override
    public List<Student> getAll(String birthDate) {
        return null;
    }

    @Override
    public Student update(Long id, Student student) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<PhysicalAssessment> getAllPhysicalAssessementId(Long id) {
        return null;
    }
}
