insert into users(id, birth_date, name) values (10001, current_date(), 'Anas');
insert into users(id, birth_date, name) values (10002, current_date(), 'Oussama');
insert into users(id, birth_date, name) values (10003, current_date(), 'Doha');

insert into post(id,description,user_id) values(10001,'I want to marry Doha',10001);
insert into post(id,description,user_id) values(10002,'I want to marry Salma',10001);
insert into post(id,description,user_id) values(10003,'I want to marry Dounia',10001);

insert into post(id,description,user_id) values(10004,'I want to marry Acebabe',10002);
insert into post(id,description,user_id) values(10005,'I want to marry Mot Achraf',10002);