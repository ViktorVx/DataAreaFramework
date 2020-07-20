--liquibase formatted sql

--changeset grade:001 author:ViktorVx runOnChange:true endDelimiter:/
create table Grade (
    id bigint primary key,
    name varchar(256) not null,
    down_salary_level NUMBER(22, 9),
    up_salary_level NUMBER(22, 9)
);
/