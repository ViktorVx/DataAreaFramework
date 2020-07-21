--liquibase formatted sql

--changeset employee:001 author:ViktorVx runOnChange:true endDelimiter:/
create table Employee (
    id bigint primary key,
    person bigint,
    department bigint,
    grade bigint,
    salary NUMBER(22, 9),
    begin_date date,
    end_date date,
    foreign key (person) references Person(id),
    foreign key (department) references Department(id),
    foreign key (grade) references Grade(id)
);
/