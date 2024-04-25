package br.com.brunostaine.academia.controllers;

import br.com.brunostaine.academia.controllers.dtos.RegistrationResponseDTO;
import br.com.brunostaine.academia.controllers.mapper.RegistrationMapper;
import br.com.brunostaine.academia.entities.Registration;
import br.com.brunostaine.academia.services.impl.RegistrationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/registration")
public class RegistrationController {
    private final RegistrationServiceImpl registrationService;

    @GetMapping
    public ResponseEntity<List<RegistrationResponseDTO>> getAll(@RequestParam(value = "city", required = false) String city) {
        List<Registration> registrations = registrationService.getAll(city);
        return ResponseEntity.ok(RegistrationMapper.toListDto(registrations));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistrationResponseDTO> getById(@PathVariable Long id) {
        Registration registration = registrationService.getById(id);
        return ResponseEntity.ok(RegistrationMapper.toDto(registration));
    }
}
