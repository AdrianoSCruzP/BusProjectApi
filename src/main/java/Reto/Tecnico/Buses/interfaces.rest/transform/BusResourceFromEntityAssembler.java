package Reto.Tecnico.Buses.interfaces.rest.transform;

import Reto.Tecnico.Buses.domain.model.aggregates.Bus;
import Reto.Tecnico.Buses.interfaces.rest.resources.BusResource;

public class BusResourceFromEntityAssembler {
    public static BusResource toResourceFromEntity(Bus entity){
        return new BusResource(entity.getId().toString(), entity.getBusNumber(), entity.getPlate(),
                entity.getCharacteristics(), entity.getCreatedAt().toString(), entity.getBusBrand().getBrand(), entity.getStatus().name());
    }
}
