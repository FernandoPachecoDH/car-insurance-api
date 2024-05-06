CREATE TABLE insurance
(
    id           BIGINT PRIMARY KEY,
    customer_id  BIGINT         NOT NULL,
    car_id       BIGINT         NOT NULL,
    creation_dt  TIMESTAMP      NOT NULL,
    updated_at   TIMESTAMP      NOT NULL,
    is_active    BOOLEAN        NOT NULL,
    CONSTRAINT fk_insurance_customer FOREIGN KEY (customer_id) REFERENCES customer (id),
    CONSTRAINT fk_insurance_car FOREIGN KEY (car_id) REFERENCES car (id),
    risc_amount  DECIMAL(10, 2) NOT NULL,
    budget_value DECIMAL(10, 2) NOT NULL
);