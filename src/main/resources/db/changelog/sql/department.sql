--liquibase formatted sql

--changeset department:001 author:ViktorVx runOnChange:true endDelimiter:/
create table department (
    id bigint primary key,
    name varchar(255) not null,
    parent_id bigint,
    foreign key (parent_id) references department(id)
);
alter table department drop constraint if exists UK_pckwqaicar1mpn27equblhqgh;
alter table department add constraint UK_pckwqaicar1mpn27equblhqgh unique (parent_id);
alter table department add constraint parent_department_fk foreign key (parent_id) references department;
/