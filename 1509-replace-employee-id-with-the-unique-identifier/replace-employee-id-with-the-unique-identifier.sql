# Write your MySQL query statement below
select unique_id, name 
from employees e
LEFT JOIN 
employeeUNI em
on e.id=em.id;