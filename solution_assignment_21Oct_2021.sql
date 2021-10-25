show databases;
use hr;
describe employees;

/* Retrieve the contact details about employees who belong to department id 10. */
select email, phone_number
from employees
where department_id=10;

/*  Retrieve details of all employees who are earning more than 10000 and whose commission_pct is greater than 0.2. */
select *
from employees
where salary>10000 and commission_pct>0.2;

/* Retrieve details of all employees who belong to department id either 10 or 20 or 50 */
select *
from employees
where department_id in(10,20,30);

/*  Search for employees whose name starts with K and ends with n. */
select *
from employees
where first_name like 'K%' and last_name like '%n';

/*  Search for employees whose last name contains 'oc' */
select employee_id, first_name, last_name
from employees
where last_name like '%oc%';

/* Search for employees who are not earning commission_pct */
select employee_id, first_name, last_name,commission_pct
from employees
where commission_pct is null;

/*  Retrieve all non duplicate manager ids from employees table */
select distinct manager_id
from employees;

/*  Sort the employees record in descending order based on salary. If two employees have same salary sorting should be done in ascending order based on last name.. */
select employee_id, first_name, last_name,salary
from employees
order by salary desc;

/* get all employees who belong  to department 50 and salary is greater than 5000 */
select employee_id, first_name, last_name,department_id,salary
from employees
where department_id=50 and salary>=5000;

/*  Get details of all employees who has job id either as SA_REP or SA_MAN */
select employee_id, first_name, last_name,job_id
from employees
where job_id in ('SA_REP', 'SA_MAN');
