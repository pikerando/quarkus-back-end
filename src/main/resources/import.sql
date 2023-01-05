insert into grouporder (id,grouporderid, name) values (123456,2, 'order1');
insert into grouporder (id,grouporderid, name) values (123457,4, 'order3');
insert into grouporder (id,grouporderid, name) values (123458,3 ,'order2');





insert into item (id,grouporderid, itemid, name) values (123456,3, 1 ,'item1');
insert into item (id,grouporderid,itemid, name) values (123457,3,2 ,'item22');
insert into item (id,grouporderid,itemid, name) values (123458,2,3 ,'item33');



insert into restaurant (id, restaurantid, name) values (123456,1,'Pizzeria La Finestra');
insert into restaurant (id, restaurantid, name) values (123457,2,'La Diva Pizzeria');
insert into restaurant (id, restaurantid, name) values (123458,3,'PIZZA BOSS Aachen');




insert into dish (id, dishid, restaurantid, name, price) values (123456, 1, 3,'Margherita Pizza',6.20);
insert into dish (id, dishid, restaurantid, name, price) values (123457, 2, 3,'Veggie Pizza', 7);
insert into dish (id, dishid, restaurantid, name, price) values (123458, 3, 3,'Cheese Pizza', 8.30);
insert into dish (id, dishid, restaurantid, name, price ) values (123459, 4, 1,'Sicilian Pizza', 12.30);