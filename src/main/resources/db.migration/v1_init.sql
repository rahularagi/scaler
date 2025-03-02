CREATE TABLE flyway_schema_history (
    installed_rank INTEGER PRIMARY KEY,
    version VARCHAR(50),
    description VARCHAR(200) NOT NULL,
    type VARCHAR(20) NOT NULL,
    script VARCHAR(1000) NOT NULL,
    checksum INTEGER,
    installed_by VARCHAR(100) NOT NULL,
    installed_on TIMESTAMP DEFAULT now() NOT NULL,
    execution_time INTEGER NOT NULL,
    success BOOLEAN NOT NULL
);

CREATE TABLE category (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE product (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    category_id BIGINT,
    description TEXT,
    image_url VARCHAR(500),
    CONSTRAINT fk_category FOREIGN KEY (category_id) REFERENCES category(id) ON DELETE SET NULL
);