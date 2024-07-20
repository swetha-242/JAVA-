/* go to Edit>preferences>sql editor>then go to last option disable it then press ok*/
create database bankDetails;
use bankDetails;
create table bank_info(bank_id int,bank_name varchar(20),bank_branch varchar(20),bank_ownerName varchar(20),bank_clientName varchar(20));
select * from bank_info;
alter table bank_info add column bank_benfid int;
alter table bank_info add column bank_pincode bigint;
alter table  bank_info add column bank_ammount bigint;
alter table bank_info add column bank_credited boolean;
alter table bank_info add column bank_cityName varchar(20);
select * from bank_info;

alter table bank_info rename column bank_id to bank_UniqueId;
alter table bank_info rename column bank_credited to bank_creditedOrNot;
alter table bank_info rename column  bank_pincode to bank_areaPincode;
alter table bank_info rename column bank_branch to bank_branchname;
alter table bank_info rename column bank_name to bank_userName;
select * from bank_info;

insert into bank_info values(1,'SBI','prabhas','royy','HPC',12,577320,400000,true,'shimoga');
insert into bank_info values(2,'Union','ganesh','pooja gandhi','navarang',30,32189,500000,true,'bangalore');
insert into bank_info values(3,'HDFC','roshan','aaliya bhat','orian',6,577201,800000,true,'mysore');
insert into bank_info values(4,'state bank ','devraj','kushi','HPC',10,32222,700000,false,'hassan');
insert into bank_info values(5,'reserve','fernandis','noushin','intanie',1,456789,110000,true,'bidar');
insert into bank_info values(6,'canara','vijay devrakonda','alli','krishna',20,674389,220000,false,'hubli');
insert into bank_info values(7,'kotak','vijay','kishani','manjunatha',6,577202,770000,true,'bagalkote');
insert into bank_info values(8,'sbi','sharukh','ramya','jaya',44,577222,706000,false,'badravathi');
insert into bank_info values(9,'DCC bank','desouza','shiyana','cotlin',22,567839,703400,true,'chikmangalore');
insert into bank_info values(10,'pragathi','densilni','koushini','priya',1,577333,700090,false,'shiggav');
select * from bank_info;

update bank_info set bank_userName="fernandis" where bank_uniqueId=1;
update  bank_info set bank_userName="swetha" where bank_uniqueId=3;
update bank_info set bank_branchname="canara" where movie_uniqueId=6;
update bank_info set bank_branchname="union" where movie_number=10;
update bank_info set bank_areaPincode="789654" where movie_uniqueId=1;
update bank_info set bank_ownerName="kevin" where bank_userName='swetha';
update bank_info set bank_benfid="99" where movie_uniqueId=3;
update bank_info set bank_clientName="basu" where movie_uniqueId=10;
update bank_info set bank_ammount="32000" where bank_ownerName='sharukh';
select * from bank_info;

delete from bank_info where bank_uniqueid=3;
delete from bank_info where bank_areaPincode=577320;
delete from bank_info where bank_cityName='shimoga';
select * from bank_info;

select * from bank_info where bank_uniqueid=4 and bank_cityName='bangalore';

select * from bank_info where bank_creditedOrNot=true or bank_ammount=700090;

select * from bank_info where bank_uniqueId in(2,4);

select * from bank_info where bank_branchname not in('canara','sbi');


