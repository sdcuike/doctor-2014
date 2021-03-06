 
drop table if exists "spring4_2015_user"
 
create table if not exists "spring4_2015_user" (
"id" bigint generated by default as identity,
"loginName" varchar(255) not null unique,
"name" varchar(64),
"password" varchar(255),
"salt" varchar(64),
"email" varchar(128),
"status" varchar(32),
"teamId" bigint,
primary key ("id")
)