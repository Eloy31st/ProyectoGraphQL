package com.example.ProyectoGraphQL.repos;


import com.example.ProyectoGraphQL.Domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    Reserva findFirstByLibro(Long libro);
}
