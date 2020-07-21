--liquibase formatted sql

--changeset work_day:001 author:ViktorVx runOnChange:true endDelimiter:/
create table work_day (
    id bigint not null,
    date timestamp,
    work_day_type integer,
    person_id bigint not null,
    primary key (id)
);
alter table work_day drop constraint if exists UK_44f1j75g72kb8iqwnnrt10ckv;
alter table work_day add constraint UK_44f1j75g72kb8iqwnnrt10ckv unique (person_id);
alter table work_day add constraint work_day_person_fk foreign key (person_id) references person;
/