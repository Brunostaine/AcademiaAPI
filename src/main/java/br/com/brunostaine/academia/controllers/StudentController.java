package br.com.brunostaine.academia.controllers;

import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.entities.Student;
import br.com.brunostaine.academia.services.impl.StudentServiceImpl;
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
    public ResponseEntity<Student> create(@RequestBody Student student) {
        Student newStudent = studentService.create(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
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
    public Student update(@PathVariable Long id, @RequestBody Student student){
        return studentService.update(id, student);
    }
    @GetMapping("/assessments/{id}")
    public List<PhysicalAssessment> getAllPhysicalAssessment(@PathVariable Long id){
        return studentService.getAllPhysicalAssessementId(id);
    }
}
