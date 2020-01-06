# spring-boot-multiple-data-bases
Spring boot fetch data with Multiple Data Sources

# used postgresql database

CREATE DATABASE schooldb;
CREATE SCHEMA schooldb;


schooldb=# INSERT INTO school VALUES(1, 'Konandur', 'National Independent PU Science Residential School');
INSERT 0 1
schooldb=# INSERT INTO school VALUES(2, 'MalaliMakki', 'Goverament High School, Malalimakki');
INSERT 0 1
schooldb=# INSERT INTO school VALUES(3, 'Demlapure', 'Goverament School, Demlapure');
INSERT 0 1
===============================================================================================================================
CREATE DATABASE studentdb;
CREATE SCHEMA studentdb;

CREATE TABLE student(id integer, name character varying(30), age integer);
ERROR:  relation "student" already exists(table already created by hibernate)

studentdb=# \d student;
                                  Table "studentdb.student"
 Column |          Type          | Collation | Nullable |               Default               
--------+------------------------+-----------+----------+-------------------------------------
 id     | integer                |           | not null | nextval('student_id_seq'::regclass)
 age    | integer                |           | not null | 
 name   | character varying(255) |           |          | 
Indexes:
    "student_pkey" PRIMARY KEY, btree (id)


INSERT INTO student VALUES(1,'Kiran',29);
INSERT 0 1
studentdb=# INSERT INTO student VALUES(1,28,'Ravi');
INSERT 0 1
studentdb=# INSERT INTO student VALUES(3,28,'Srinatha');
INSERT 0 1
