insert into grouporder (id,restaurantid, name, creator, status, totalprice) values (11,11, 'order1', 'patrick', 0, 8.30);
insert into grouporder (id,restaurantid, name, creator, status, totalprice) values (12,12, 'order3', 'youssef', 0,0);
insert into grouporder (id,restaurantid, name, creator, status, totalprice) values (13,13,'order2', 'youssef', 1, 13.20);





insert into item (id,grouporderid, dishname, creator, extras, price) values (11, 12, 'Margherita Pizza', 'patrick', 'without onion', 5.5);
insert into item (id,grouporderid, dishname, creator, extras, price) values (12, 12, 'Margherita Pizza', 'youssef', 'with mias', 6.4);
insert into item (id,grouporderid, dishname, creator, extras, price) values (13, 12, 'Margherita Pizza', 'johannes', 'with mias', 6.4);
insert into item (id,grouporderid, dishname, creator, extras, price) values (14, 12, 'Margherita salame', 'minakshi', 'with mias', 6.4);
insert into item (id,grouporderid, dishname, creator, extras, price) values (15, 12, 'Margherita salame', 'bob', 'with mias', 6.4);
insert into item (id,grouporderid, dishname, creator, extras, price) values (16, 13, 'Margherita Pizza', 'alice', 'with k', 7.3);



insert into restaurant (id, name) values (11,'Pizzeria La Finestra');
insert into restaurant (id,  name) values (12,'La Diva Pizzeria');
insert into restaurant (id,  name) values (13,'PIZZA BOSS Aachen');




insert into dish (id, restaurantid, name, price) values ( 11, 13,'Margherita Pizza',6.20);
insert into dish (id,  restaurantid, name, price) values ( 12, 13,'Veggie Pizza', 7);
insert into dish (id,  restaurantid, name, price) values ( 13, 13,'Cheese Pizza', 8.30);
insert into dish (id,  restaurantid, name, price ) values ( 14, 11,'Sicilian Pizza', 12.30);