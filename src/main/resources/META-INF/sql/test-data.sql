insert into users(id, username, password) values (1, 'admin', 'secret');
insert into users(id, username, password) values (2, 'user1', '1111');

insert into users_role(member_id, role) values (1, 'ROLE_ADMIN');
insert into users_role(member_id, role) values (1, 'ROLE_USER');
insert into users_role(member_id, role) values (2, 'ROLE_USER');
