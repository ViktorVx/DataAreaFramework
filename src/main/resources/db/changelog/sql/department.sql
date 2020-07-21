--liquibase formatted sql

--changeset department:001 author:ViktorVx runOnChange:true endDelimiter:/
create table department (
    id bigint primary key,
    name varchar(255) not null,
    parent_id bigint,
    foreign key (parent_id) references department(id)
);
alter table department add constraint parent_department_fk foreign key (parent_id) references department
/