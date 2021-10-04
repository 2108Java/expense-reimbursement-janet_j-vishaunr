create table Employee(first_name varchar(30),last_name varchar(30),Title varchar(30),id serial primary key);
create table EmployeeCredentials(credential_id serial primary key,username   varchar(30) unique,password varchar(30),fk_id int unique not null references Employee(id));

create table Reimbursement(reimbursement_id serial  primary key,request_Reimbursement boolean,reimbursement_Type varchar(30),Approved boolean, fk2_id int unique not null references Employee(id),last_name varchar(30));



drop table Employee;
drop table employeecredentials ;
drop table reimbursement ;


insert into employee (first_name ,last_name ,Title)values
	('Tom','Albert','Employee'),
	  ('John','Jackson','Manager'),
	  ('Jarl','Wheathers','Employee'),
	  ('Sasha','Scnieder','Manager'),
	  ('Kelly','Moses','Employee');


insert into EmployeeCredentials (username ,password,fk_id)values
('EmployeeTom','pass',001),
('ManagerJohn','pass',002),
('EmployeeJarl','pass',003),
('ManagerSasha','pass',004),
('EmployeeKelly','pass',005);


insert into reimbursement(fk2_id,last_name)
values(001,'Albert'),
(002,'Jackson'),
(003,'Wheathers'),
(004,'Scnieder'),
(005,'Moses');


select *
from reimbursement ;

select *
from employeecredentials ;

select *
from employee;












alter table employee
drop column request_Reimbursement;

alter table reimbursement 
add column id int;

alter table reimbursement 
add column first_name varchar(30);
alter table reimbursement 
add column last_name varchar(30);



alter table reimbursement 
drop constraint r_id;

alter table reimbursement 
drop column r_id ;

update reimbursement r
set request_reimbursement = true, r.r_id 

drop table employee  cascade constraints purge;










select *
from reimbursement r ;

select *
from employee e ;




create view employeeStatus
as
select approved, R_id
from reimbursement;



select *
from reimbursement ; 

select *
from employee e
inner join reimbursement r
on e.id = r.R_id;
