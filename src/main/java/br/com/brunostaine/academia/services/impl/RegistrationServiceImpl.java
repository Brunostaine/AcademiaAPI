package br.com.brunostaine.academia.services.impl;

import br.com.brunostaine.academia.entities.Registration;
import br.com.brunostaine.academia.repositories.RegistrationRepository;
import br.com.brunostaine.academia.services.IRegistration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements IRegistration {

    private final RegistrationRepository registrationRepository;


    @Override
    public Registration getById(Long registration) {
        return registrationRepository.findById(registration).orElseThrow();
    }

    @Override
    public List<Registration> getAll(String city) {
        return registrationRepository.findAll();
    }
}
