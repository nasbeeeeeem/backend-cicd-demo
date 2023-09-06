drop table if exists item;

create table item (
  id serial not null primary key,
  item_name text
);

insert into item (id, item_name) values (1, '大豆');
insert into item (id, item_name) values (2, '小豆');