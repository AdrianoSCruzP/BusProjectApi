package Reto.Tecnico.Buses.domain.model.aggregates;

import Reto.Tecnico.Buses.domain.model.entities.BusBrand;
import Reto.Tecnico.Buses.domain.model.valueobjects.BusStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
@Data
@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer busNumber;

    private String plate;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdAt;

    private String characteristics;

    @ManyToOne
    @JoinColumn(name = "busBrand_id")
    private BusBrand busBrand;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private BusStatus status;

    public Bus() {
        this.id = null;
        this.busNumber = null;
        this.plate = null;
        this.characteristics = null;
        this.createdAt = null;
        this.busBrand = null;
        this.status = null;
    }

    public Bus(Long id, Integer busNumber, String plate, String characteristics, Date createdAt, BusBrand busBrand, BusStatus status) {
        this.id = id;
        this.busNumber = busNumber;
        this.plate = plate;
        this.characteristics = characteristics;
        this.createdAt = createdAt;
        this.busBrand = busBrand;
        this.status = status;
    }
}
