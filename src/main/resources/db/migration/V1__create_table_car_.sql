CREATE TABLE car
(
    id           BIGINT PRIMARY KEY,
    model        VARCHAR(255)   NOT NULL,
    manufacturer VARCHAR(255)   NOT NULL,
    year         INTEGER        NOT NULL,
    fipe_value   DECIMAL(10, 2) NOT NULL
);


