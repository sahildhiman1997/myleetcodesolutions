# Write your MySQL query statement below

select d.name as Department, e.name as Employee, Salary from 
(
SELECT departmentId, name, Salary, dense_rank() over (partition by departmentId order by Salary DESC) ranks
 from Employee) e
 JOIN Department d on d.id=departmentId
where e.ranks<4