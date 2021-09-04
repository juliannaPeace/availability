CREATE TABLE product
(
    id           uuid PRIMARY KEY,
    name         varchar NOT NULL,
    price        numeric(19,2),
    description  varchar
);