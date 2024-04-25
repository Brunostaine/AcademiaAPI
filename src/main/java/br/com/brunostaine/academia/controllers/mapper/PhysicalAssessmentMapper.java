package br.com.brunostaine.academia.controllers.mapper;

import br.com.brunostaine.academia.controllers.dtos.PhysicalAssessmentRequestDTO;
import br.com.brunostaine.academia.controllers.dtos.PhysicalAssessmentResponseDTO;
import br.com.brunostaine.academia.entities.PhysicalAssessment;
import org.modelmapper.ModelMapper;

public class PhysicalAssessmentMapper {
    public static PhysicalAssessment toAssessment(PhysicalAssessmentRequestDTO dto){
        return new ModelMapper().map(dto, PhysicalAssessment.class);
    }
    public static PhysicalAssessmentResponseDTO toDto(PhysicalAssessment physicalAssessment){
        return new ModelMapper().map(physicalAssessment, PhysicalAssessmentResponseDTO.class);
    }
}
