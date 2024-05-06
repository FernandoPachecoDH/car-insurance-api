package br.com.audast.insurance.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Embeddable
public class CarDriverId implements Serializable {
    @Column(name = "car_id")
    private Long carId;

    @Column(name = "driver_id")
    private Long driverId;
}
