package com.example.ProyectoGraphQL.repos;

import com.example.ProyectoGraphQL.Domain.Autor;
import com.example.ProyectoGraphQL.Domain.Categoria;
import com.example.ProyectoGraphQL.Domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    Libro findFirstByAutor(Autor autor);
    Libro findFirstByCategoria(Categoria categoria);
}
