package br.com.brunostaine.academia.repositories;

import br.com.brunostaine.academia.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
