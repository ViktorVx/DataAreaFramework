--liquibase formatted sql

--changeset employee_workdays:001 author:ViktorVx runOnChange:true endDelimiter:/
create table employee_workdays (
    employee bigint,
    work_day bigint,
    primary key(employee, work_day)
);
/