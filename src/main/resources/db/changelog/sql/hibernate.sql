--liquibase formatted sql

--changeset hibernate:001 author:ViktorVx runOnChange:true endDelimiter:/
create sequence hibernate_sequence start with 1 increment by 1;
/