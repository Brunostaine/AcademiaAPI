package br.com.brunostaine.academia.controllers.mapper;

import br.com.brunostaine.academia.controllers.dtos.RegistrationResponseDTO;
import br.com.brunostaine.academia.entities.Registration;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class RegistrationMapper {
    public static Registration toRegistration(RegistrationResponseDTO dto){
        return new ModelMapper().map(dto, Registration.class);
    }

    public static RegistrationResponseDTO toDto(Registration registration){
        return new ModelMapper().map(registration, RegistrationResponseDTO.class);
    }

    public static List<RegistrationResponseDTO> toListDto(List<Registration> registrationList){
        return registrationList.stream().map(registration -> toDto(registration)).collect(Collectors.toList());
    }
}
