insert into grouporder (id, name, creator, status, totalprice) values (11, 'order1', 'patrick', 0, 8.30);
insert into grouporder (id, name, creator, status, totalprice) values (12, 'order3', 'youssef', 0,0);
insert into grouporder (id, name, creator, status, totalprice) values (13,'order2', 'youssef', 1, 13.20);





insert into item (id,grouporderid, dishname, extras, price) values (11,11,'Margherita Pizza','without onion', 5.5);
insert into item (id,grouporderid, dishname, extras, price) values (12,11,'Margherita Pizza','with mias', 6.4);
insert into item (id,grouporderid, dishname, extras, price) values (13,13,'Margherita Pizza','with k', 7.3);



insert into restaurant (id, name) values (11,'Pizzeria La Finestra');
insert into restaurant (id,  name) values (12,'La Diva Pizzeria');
insert into restaurant (id,  name) values (13,'PIZZA BOSS Aachen');




insert into dish (id, restaurantid, name, price) values ( 11, 13,'Margherita Pizza',6.20);
insert into dish (id,  restaurantid, name, price) values ( 12, 13,'Veggie Pizza', 7);
insert into dish (id,  restaurantid, name, price) values ( 13, 13,'Cheese Pizza', 8.30);
insert into dish (id,  restaurantid, name, price ) values ( 14, 11,'Sicilian Pizza', 12.30);