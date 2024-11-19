package Reto.Tecnico.Buses.infrastructure.persistence.jpa.repositories;

import Reto.Tecnico.Buses.domain.model.aggregates.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
}
