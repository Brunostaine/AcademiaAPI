package br.com.brunostaine.academia.controllers;

import br.com.brunostaine.academia.controllers.mapper.StudentMapper;
import br.com.brunostaine.academia.controllers.dtos.StudentRequestDTO;
import br.com.brunostaine.academia.controllers.dtos.StudentResponseDTO;
import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.entities.Student;
import br.com.brunostaine.academia.services.impl.StudentServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/students")
public class StudentController {
    private final StudentServiceImpl studentService;

    @PostMapping
    public ResponseEntity<StudentResponseDTO> create(@RequestBody @Valid StudentRequestDTO studentDTO) {
        Student student = studentService.create(StudentMapper.toStudent(studentDTO));
        return ResponseEntity.status(HttpStatus.CREATED).body(StudentMapper.toDto(student));
    }

    @GetMapping
    public List<Student> getAll(@RequestParam(value = "birthDate", required = false) String birthDate){
        return studentService.getAll(birthDate);
    }
    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody @Valid StudentRequestDTO studentDTO){
        return studentService.update(id, studentDTO);
    }
    @GetMapping("/assessments/{id}")
    public List<PhysicalAssessment> getAllPhysicalAssessment(@PathVariable Long id){
        return studentService.getAllPhysicalAssessementId(id);
    }
}
