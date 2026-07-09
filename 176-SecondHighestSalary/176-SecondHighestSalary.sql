-- Last updated: 7/9/2026, 3:17:27 PM
# Write your MySQL query statement below
SELECT
(
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1

)As SecondHighestSalary;
