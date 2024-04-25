package br.com.brunostaine.academia.services.impl;

import br.com.brunostaine.academia.controllers.dtos.StudentRequestDTO;
import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.entities.Registration;
import br.com.brunostaine.academia.entities.Student;
import br.com.brunostaine.academia.exceptions.CpfUniqueViolationException;
import br.com.brunostaine.academia.exceptions.EntityNotFoundException;
import br.com.brunostaine.academia.repositories.RegistrationRepository;
import br.com.brunostaine.academia.repositories.StudentRepository;
import br.com.brunostaine.academia.services.IStudent;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudent {
    private final StudentRepository studentRepository;
    private final RegistrationRepository registrationRepository;


    @Override
    @Transactional
    public Student create(Student student) {
        try {
            Student newStudent = studentRepository.save(student);
            Registration newRegistration = new Registration();

            newRegistration.setStudent(newStudent);
            newStudent.setRegistration(newRegistration);
            registrationRepository.save(newRegistration);

            return newStudent;
        } catch (DataIntegrityViolationException ex) {
            throw new CpfUniqueViolationException(String.format("CPF %s already registered in the database.", student.getCpf()));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Student getById(Long id) {
        return studentRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException(String.format("Student not found! " + id)));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAll(String birthDate) {
        return studentRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Student update(Long id, StudentRequestDTO student) {
        try {

            Student updateStudent = studentRepository.findById(id).orElseThrow(() ->
                    new EntityNotFoundException(String.format("Student id=%s not found! ", id)));

            updateStudent.setName(student.getName());
            updateStudent.setCpf(student.getCpf());
            updateStudent.setCity(student.getCity());
            updateStudent.setBirthDate(student.getBirthDate());
            return studentRepository.save(updateStudent);
        } catch (EntityNotFoundException ex) {
            throw new EntityNotFoundException(
                    String.format("We did not find the student in the database." + id));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<PhysicalAssessment> getAllPhysicalAssessementId(Long id) {
        return null;
    }
}
