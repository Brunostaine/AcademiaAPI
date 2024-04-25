package br.com.brunostaine.academia.services.impl;

import br.com.brunostaine.academia.entities.Registration;
import br.com.brunostaine.academia.exceptions.EntityNotFoundException;
import br.com.brunostaine.academia.repositories.RegistrationRepository;
import br.com.brunostaine.academia.services.IRegistration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements IRegistration {

    private final RegistrationRepository registrationRepository;


    @Override
    @Transactional(readOnly = true)
    public Registration getById(Long registration) {
        return registrationRepository.findById(registration).orElseThrow(
                () -> new EntityNotFoundException(String.format("Registration not found! " + registration))
        );
    }

    @Override
    @Transactional(readOnly = true)
    public List<Registration> getAll(String city) {
        return registrationRepository.findAll();
    }
}
