package br.com.brunostaine.academia.services.impl;

import br.com.brunostaine.academia.entities.Registration;
import br.com.brunostaine.academia.services.IRegistration;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegistrationServiceImpl implements IRegistration {
    @Override
    public Registration create(Registration registration) {
        return null;
    }

    @Override
    public Registration getById(Long id) {
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
