package br.com.brunostaine.academia.controllers;

import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.services.impl.PhysicalAssessmentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/assessments")
public class PhysicalAssessmentController {
    private final PhysicalAssessmentServiceImpl physicalAssessmentService;

    @PostMapping
    public PhysicalAssessment create(@RequestBody PhysicalAssessment physicalAssessment){

        return physicalAssessmentService.create(physicalAssessment);
    }
    @GetMapping
    public List<PhysicalAssessment> getAll(){
        return physicalAssessmentService.getAll();
    }
}
