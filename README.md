# ProjectSpring_005_JdbcTemplate_MVC

db.driver = org.postgresql.Driver
db.url = jdbc:postgresql://localhost:5432/db_site
db.username = postgres
db.password = 2687484a

db_site.public

CREATE TABLE admin
(
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(20) NOT NULL,
    path VARCHAR(20) NOT NULL,
    icon VARCHAR(30) NOT NULL
);
CREATE TABLE admin_id_seq
(
    sequence_name VARCHAR NOT NULL,
    last_value BIGINT NOT NULL,
    start_value BIGINT NOT NULL,
    increment_by BIGINT NOT NULL,
    max_value BIGINT NOT NULL,
    min_value BIGINT NOT NULL,
    cache_value BIGINT NOT NULL,
    log_cnt BIGINT NOT NULL,
    is_cycled BOOL NOT NULL,
    is_called BOOL NOT NULL
);
CREATE TABLE content
(
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(20) NOT NULL,
    path VARCHAR(20) NOT NULL
);
CREATE TABLE content_id_seq
(
    sequence_name VARCHAR NOT NULL,
    last_value BIGINT NOT NULL,
    start_value BIGINT NOT NULL,
    increment_by BIGINT NOT NULL,
    max_value BIGINT NOT NULL,
    min_value BIGINT NOT NULL,
    cache_value BIGINT NOT NULL,
    log_cnt BIGINT NOT NULL,
    is_cycled BOOL NOT NULL,
    is_called BOOL NOT NULL
);
CREATE TABLE content_section
(
    id SERIAL PRIMARY KEY NOT NULL,
    id_content INT NOT NULL,
    id_section INT NOT NULL
);
CREATE TABLE content_section_id_seq
(
    sequence_name VARCHAR NOT NULL,
    last_value BIGINT NOT NULL,
    start_value BIGINT NOT NULL,
    increment_by BIGINT NOT NULL,
    max_value BIGINT NOT NULL,
    min_value BIGINT NOT NULL,
    cache_value BIGINT NOT NULL,
    log_cnt BIGINT NOT NULL,
    is_cycled BOOL NOT NULL,
    is_called BOOL NOT NULL
);
CREATE TABLE section
(
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(20) NOT NULL
);
CREATE TABLE section_id_seq
(
    sequence_name VARCHAR NOT NULL,
    last_value BIGINT NOT NULL,
    start_value BIGINT NOT NULL,
    increment_by BIGINT NOT NULL,
    max_value BIGINT NOT NULL,
    min_value BIGINT NOT NULL,
    cache_value BIGINT NOT NULL,
    log_cnt BIGINT NOT NULL,
    is_cycled BOOL NOT NULL,
    is_called BOOL NOT NULL
);
ALTER TABLE content_section ADD FOREIGN KEY (id_content) REFERENCES content (id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE content_section ADD FOREIGN KEY (id_section) REFERENCES section (id) ON DELETE CASCADE ON UPDATE CASCADE;
