package Reto.Tecnico.Buses.application.internal.queryservices;

import Reto.Tecnico.Buses.domain.model.aggregates.Bus;
import Reto.Tecnico.Buses.domain.model.queries.GetAllBusesQuery;
import Reto.Tecnico.Buses.domain.model.queries.GetBusByIdQuery;
import Reto.Tecnico.Buses.domain.services.BusQueryService;
import Reto.Tecnico.Buses.infrastructure.persistence.jpa.repositories.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusQueryServiceImpl implements BusQueryService {
    private final BusRepository busRepository;

    public BusQueryServiceImpl(BusRepository busRepository){this.busRepository = busRepository;}

    @Override
    public List<Bus> handle(GetAllBusesQuery query) {
        return busRepository.findAll();
    }

    @Override
    public Optional<Bus> handle(GetBusByIdQuery query) {
        return busRepository.findById(query.id());
    }
}
