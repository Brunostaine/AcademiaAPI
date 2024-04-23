package br.com.brunostaine.academia.services.impl;

import br.com.brunostaine.academia.entities.Registration;
import br.com.brunostaine.academia.repositories.RegistrationRepository;
import br.com.brunostaine.academia.repositories.StudentRepository;
import br.com.brunostaine.academia.services.IRegistration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements IRegistration {
    private final StudentRepository studentRepository;
    private final RegistrationRepository registrationRepository;

    @Override
    public Registration create(Registration registration) {
        return null;
    }

    @Override
    public Registration getById(Long id)  {
        return null;
    }

    @Override
    public List<Registration> getAll(String city) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
