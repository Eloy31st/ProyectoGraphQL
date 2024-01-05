package com.example.ProyectoGraphQL.repos;

import com.example.ProyectoGraphQL.Domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}
