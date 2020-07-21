--liquibase formatted sql

--changeset organization:001 author:ViktorVx runOnChange:true endDelimiter:/
create table organization (
    id bigint not null,
    name varchar(255) not null,
    primary key (id)
);
create table organization_departments (
    organization_id bigint not null,
    departments_id bigint not null,
    primary key (organization_id, departments_id)
);
alter table organization_departments drop constraint if exists UK_tbadv8h3b8styrn20tbktn4j5;
alter table organization_departments add constraint UK_tbadv8h3b8styrn20tbktn4j5 unique (departments_id);
alter table organization_departments add constraint FKtfsi1dy1xvjlg1l8g0j2l4vyn foreign key (departments_id) references department;
alter table organization_departments add constraint FKher0nju9m3bo0dbrjh7fh7okd foreign key (organization_id) references organization;
/