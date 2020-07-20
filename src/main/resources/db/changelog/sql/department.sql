--liquibase formatted sql

--changeset department:001 author:ViktorVx runOnChange:true endDelimiter:/
create table Department (
    id bigint primary key,
    name varchar(256) not null,
    parent bigint,
    foreign key (parent) references Department(id)
);
/