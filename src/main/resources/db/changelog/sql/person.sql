--liquibase formatted sql

--changeset person:001 author:ViktorVx runOnChange:true endDelimiter:/
create table Person (
    id bigint primary key,
    first_name varchar(256) not null,
    last_name varchar(256),
    middle_name varchar(256) not null,
    birth_date date,
    gender varchar(1)
);
/