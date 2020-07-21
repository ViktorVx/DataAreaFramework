--liquibase formatted sql

--changeset person:001 author:ViktorVx runOnChange:true endDelimiter:/
create table person (
    id bigint primary key,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    middle_name varchar(255),
    birth_date timestamp,
    gender integer
);
/