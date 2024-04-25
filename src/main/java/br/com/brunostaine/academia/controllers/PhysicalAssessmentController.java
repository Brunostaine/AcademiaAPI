package br.com.brunostaine.academia.controllers;

import br.com.brunostaine.academia.controllers.dtos.PhysicalAssessmentRequestDTO;
import br.com.brunostaine.academia.controllers.dtos.PhysicalAssessmentResponseDTO;
import br.com.brunostaine.academia.controllers.mapper.PhysicalAssessmentMapper;
import br.com.brunostaine.academia.entities.PhysicalAssessment;
import br.com.brunostaine.academia.services.impl.PhysicalAssessmentServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/assessments")
public class PhysicalAssessmentController {
    private final PhysicalAssessmentServiceImpl physicalAssessmentService;

    @PostMapping
    public ResponseEntity<PhysicalAssessmentResponseDTO> create(@RequestBody @Valid PhysicalAssessmentRequestDTO assessmentDto) {
        PhysicalAssessment assessment = physicalAssessmentService.create(PhysicalAssessmentMapper.toAssessment(assessmentDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(PhysicalAssessmentMapper.toDto(assessment));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PhysicalAssessmentResponseDTO> getById(@PathVariable Long id) {
        PhysicalAssessment physicalAssessment = physicalAssessmentService.getById(id);
        return ResponseEntity.ok(PhysicalAssessmentMapper.toDto(physicalAssessment));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PhysicalAssessmentResponseDTO> delete(@PathVariable Long id) {
        physicalAssessmentService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
