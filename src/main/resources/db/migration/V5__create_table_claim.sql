CREATE TABLE claim
(
    id           BIGINT PRIMARY KEY,
    car_id       BIGINT    NOT NULL,
    driver_id    BIGINT    NOT NULL,
    event_date   TIMESTAMP NOT NULL,
    CONSTRAINT fk_claim_car FOREIGN KEY (car_id) REFERENCES car (id),
    CONSTRAINT fk_claim_driver FOREIGN KEY (driver_id) REFERENCES driver (id),
);
