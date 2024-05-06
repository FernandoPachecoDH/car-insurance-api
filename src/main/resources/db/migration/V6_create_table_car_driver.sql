CREATE TABLE car_driver
(
    car_id         BIGINT  NOT NULL,
    driver_id      BIGINT  NOT NULL,
    is_main_driver BOOLEAN NOT NULL,
    PRIMARY KEY (car_id, driver_id),
    CONSTRAINT fk_car_driver_car FOREIGN KEY (car_id) REFERENCES car (id),
    CONSTRAINT fk_car_driver_driver FOREIGN KEY (driver_id) REFERENCES driver (id)
);