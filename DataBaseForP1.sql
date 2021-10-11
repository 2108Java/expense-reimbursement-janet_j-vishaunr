create table Employee(id serial primary key,first_name varchar(30),last_name varchar(30),Title varchar(30),email varchar(30));
create table EmployeeCredentials(credential_id serial primary key,username   varchar(30) unique,password varchar(30),fk_id  serial unique not null references Employee(id));

create table Reimbursement(reimbursement_id serial  primary key,reimbursement_Type varchar(30),amount_Reimbursed numeric,Description varchar(200),request_Date_Time timestamp, fk2_id serial unique not null references Employee(id),Approval varchar(30),approved_Date_Time  TIMESTAMP);



drop table Employee;
drop table employeecredentials ;
drop table reimbursement ;


insert into employee (first_name ,last_name ,Title,email)values
	('Tom','Albert','Employee','TomAlbert@yahoo.com'),
	  ('John','Jackson','Manager','JohanJackson@yahoo.com'),
	  ('Jarl','Wheathers','Employee','JarlWheathers@yahoo.com'),
	  ('Sasha','Scnieder','Manager','SashaScnieder@yahoo.com'),
	  ('Kelly','Moses','Employee','KellyMoses@yahoo.com');


insert into EmployeeCredentials (username ,password)values
('EmployeeTom','pass'),
('ManagerJohn','pass'),
('EmployeeJarl','pass'),
('ManagerSasha','pass'),
('EmployeeKelly','pass');


insert into reimbursement(Approval)
values('pending'),
('pending'),
('pending'),
('pending'),
('pending');


select *
from reimbursement ;
<-- add a amount column, include date where they sumbit?
<-- needs to be two time stamps, when Employee submitted request and when Manager approved it!
select *
from employeecredentials ;
<-- take out credential_id
select *
from employee;
<-- send use temp password, add temp username, temp password when creating account



update reimbursement 
set approval = 'denied',approved_date_time= current_timestamp 
where reimbursement_id =2;



alter table reimbursement 
drop column request_reimbursement;



alter table employeecredentials 



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





update reimbursement 
set reimbursement_type = 'food', amount_reimbursed =100,description='i am hungry',request_date_time = current_timestamp 
where reimbursement_id = 3;




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