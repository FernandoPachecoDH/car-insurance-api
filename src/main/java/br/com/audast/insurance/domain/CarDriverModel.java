package br.com.audast.insurance.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "car_driver")
public class CarDriverModel {
    @EmbeddedId
    private CarDriverId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("carId")
    @JoinColumn(name = "car_id")
    private CarModel car;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("driverId")
    @JoinColumn(name = "driver_id")
    private DriverModel driver;

    @Column(name = "is_main_driver")
    private Boolean isMainDriver;
}
