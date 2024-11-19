package Reto.Tecnico.Buses.domain.services;

import Reto.Tecnico.Buses.domain.model.aggregates.Bus;
import Reto.Tecnico.Buses.domain.model.queries.GetAllBusesQuery;
import Reto.Tecnico.Buses.domain.model.queries.GetBusByIdQuery;

import java.util.List;
import java.util.Optional;

public interface BusQueryService {
    List<Bus> handle(GetAllBusesQuery query);
    Optional<Bus> handle(GetBusByIdQuery query);
}
