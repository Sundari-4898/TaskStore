create database store;

use store;

create table store_grocery(
SiNo int primary key auto_increment,
DateOfPurchase date,
DayOfPurchase varchar(100),
NoOfProductPurchased varchar(100),
TotalIncome varchar(10000),
TotalExpense varchar(5000));
