--liquibase formatted sql

--changeset grade:001 author:ViktorVx runOnChange:true endDelimiter:/
create table grade (
    id bigint primary key,
    name varchar(255) not null,
    down_salary_level decimal(19,2),
    up_salary_level decimal(19,2)
);
/