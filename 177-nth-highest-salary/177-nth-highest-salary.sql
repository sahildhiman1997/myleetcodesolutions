CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
# DECLARE M INT;
SET  N = N-1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT DISTINCT salary FROM Employee
      ORDER BY salary DESC
      LIMIT N, 1
      
  );
END