package br.com.brunostaine.academia.services;

import br.com.brunostaine.academia.entities.Registration;

import java.util.List;

public interface IRegistration {
    Registration getById(Long registration);
    List<Registration> getAll(String city);

}
