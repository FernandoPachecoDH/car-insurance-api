CREATE TABLE customer
(
    id        BIGINT PRIMARY KEY,
    name      VARCHAR(255) NOT NULL,
    driver_id BIGINT       NOT NULL,
    CONSTRAINT fk_customer_driver FOREIGN KEY (driver_id) REFERENCES driver (id)
);