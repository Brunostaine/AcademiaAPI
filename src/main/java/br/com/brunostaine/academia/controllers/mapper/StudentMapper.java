package br.com.brunostaine.academia.controllers.mapper;

import br.com.brunostaine.academia.controllers.dtos.StudentRequestDTO;
import br.com.brunostaine.academia.controllers.dtos.StudentResponseDTO;
import br.com.brunostaine.academia.entities.Student;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMapper {
    public static Student toStudent(StudentRequestDTO requestDTO){
        return new ModelMapper().map(requestDTO, Student.class);
    }

    public static StudentResponseDTO toDto(Student student){
        return new ModelMapper().map(student, StudentResponseDTO.class);
    }

    public List<StudentResponseDTO> toListDto(List<Student> students){
        return students.stream().map(StudentMapper::toDto).collect(Collectors.toList());
    }
}
