package br.com.brunostaine.academia.controllers;

import br.com.brunostaine.academia.entities.Registration;
import br.com.brunostaine.academia.services.impl.RegistrationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/registration")
public class RegistrationController {
    private final RegistrationServiceImpl registrationService;

    @GetMapping
    public List<Registration> getAll(@RequestParam(value = "city", required = false) String city){
        return registrationService.getAll(city);
    }
}
