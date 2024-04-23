package br.com.brunostaine.academia.controllers;

import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.services.impl.PhysicalAssessmentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/assessments")
public class PhysicalAssessmentController {
    private final PhysicalAssessmentServiceImpl physicalAssessmentService;

    @PostMapping
    public PhysicalAssessment create(@RequestBody PhysicalAssessment physicalAssessment) {
        return physicalAssessmentService.create(physicalAssessment);
    }

    @GetMapping("/{id}")
    public Optional<PhysicalAssessment> getById(@PathVariable Long id) {
        return physicalAssessmentService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        physicalAssessmentService.delete(id);
    }

}
