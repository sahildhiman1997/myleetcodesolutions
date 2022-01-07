SELECT d.name as Department, e.name as Employee, Salary FROM Employee e
JOIN
(SELECT departmentId, MAX(salary) as salary FROM Employee
GROUP BY departmentId) as maxSalaries
USING (salary, departmentId )

JOIN

Department d
ON (d.id=e.departmentId)