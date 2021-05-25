create table courses
(
    id bigint generated by default as identity
        constraint courses_pkey primary key,
    title varchar(255),
    description varchar(255)
);

insert into courses (title, description)
values ('Course1', 'Course1 description'),
       ('Course2', 'Course2 description'),
       ('Course3', 'Course3 description'),
       ('Course4', 'Course4 description');