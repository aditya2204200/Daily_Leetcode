CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    declare offset_val int;
   set offset_val = N-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary from Employee
      order by salary desc
      limit offset_val , 1

  );
END