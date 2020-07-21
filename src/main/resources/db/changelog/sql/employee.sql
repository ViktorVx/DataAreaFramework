--liquibase formatted sql

--changeset employee:001 author:ViktorVx runOnChange:true endDelimiter:/
create table employee (
    id bigint not null,
    begin_date timestamp,
    end_date timestamp,
    salary decimal(19,2),
    department_id bigint not null,
    grade_id bigint not null,
    person_id bigint not null,
    primary key (id)
);
create table employee_work_days (
    employee_id bigint not null,
    work_days_id bigint not null
);
alter table employee drop constraint if exists UK_hr5ovw667hkx0jl5cmyo66wb8;
alter table employee add constraint UK_hr5ovw667hkx0jl5cmyo66wb8 unique (department_id);
alter table employee drop constraint if exists UK_6jmg0ygrr0mwnq1tfqrkjk6xd;
alter table employee add constraint UK_6jmg0ygrr0mwnq1tfqrkjk6xd unique (grade_id);
alter table employee drop constraint if exists UK_6rpeoojvw6pbporri8w66n164;
alter table employee add constraint UK_6rpeoojvw6pbporri8w66n164 unique (person_id);
alter table employee_work_days drop constraint if exists UK_lte1b1y1w3oqg5rxd9vb2ih49;
alter table employee_work_days add constraint UK_lte1b1y1w3oqg5rxd9vb2ih49 unique (work_days_id);
alter table employee add constraint FKbejtwvg9bxus2mffsm3swj3u9 foreign key (department_id) references department;
alter table employee add constraint FKn6mje2tx88laybhlg806pox0o foreign key (grade_id) references grade;
alter table employee add constraint FKfm68kmqett1iydj8xgfb6two8 foreign key (person_id) references person;
alter table employee_work_days add constraint FK8ybc997upo1knyajda2dxkk0n foreign key (work_days_id) references work_day;
alter table employee_work_days add constraint FKq2pf0x7f0lmdhmtggh7t0osfi foreign key (employee_id) references employee;

/