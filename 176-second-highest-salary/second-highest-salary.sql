# Write your MySQL query statement below
select MAX(salary) as SecondHighestSalary 
from employee
WHERE salary<(select MAX(SALARY)  FROM EMPLOYEE);
