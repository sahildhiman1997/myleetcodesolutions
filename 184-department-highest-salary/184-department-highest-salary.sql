select d.name as Department, e.name as Employee, e.Salary from Employee e
join
Department d
on (e.departmentId = d.id)

where(salary, e.departmentId )
in

(SELECT MAX(Salary), departmentId FROM Employee
GROUP BY departmentId)