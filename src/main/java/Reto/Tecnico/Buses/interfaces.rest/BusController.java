package Reto.Tecnico.Buses.interfaces.rest;

import Reto.Tecnico.Buses.domain.model.queries.GetAllBusesQuery;
import Reto.Tecnico.Buses.domain.model.queries.GetBusByIdQuery;
import Reto.Tecnico.Buses.domain.services.BusQueryService;
import Reto.Tecnico.Buses.interfaces.rest.resources.BusResource;
import Reto.Tecnico.Buses.interfaces.rest.transform.BusResourceFromEntityAssembler;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/bus", produces = MediaType.APPLICATION_JSON_VALUE)
public class BusController {
    private final BusQueryService busQueryService;
    public BusController(BusQueryService busQueryService){
        this.busQueryService = busQueryService;
    }

    @GetMapping
    public ResponseEntity<List<BusResource>> getAllBuses(){
        var getAllBusesQuery = new GetAllBusesQuery();
        var buses = busQueryService.handle(getAllBusesQuery);
        var buseResources = buses.stream().map(BusResourceFromEntityAssembler::toResourceFromEntity).toList();
        return ResponseEntity.ok(buseResources);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BusResource> getBusById(@PathVariable Long id){
        var getBusByIdQuery = new GetBusByIdQuery(id);
        var bus = busQueryService.handle(getBusByIdQuery);
        if (bus.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        var busResource = BusResourceFromEntityAssembler.toResourceFromEntity(bus.get());
        return ResponseEntity.ok(busResource);
    }
}
