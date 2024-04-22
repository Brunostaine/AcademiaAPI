package br.com.brunostaine.academia.services.impl;

import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.entities.Student;
import br.com.brunostaine.academia.services.IStudent;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlunoServiceImpl implements IStudent {
    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student getById(Long id) {
        return null;
    }

    @Override
    public List<Student> getAll(Student birthDate) {
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
