-- Last updated: 7/9/2026, 3:17:15 PM
# Write your MySQL query statement below
SELECT 
     d.name AS Department,
     e.name AS Employee,
     e.salary AS Salary
FROM Employee e
JOIN Department d
    ON e.departmentId = d.id
WHERE (e.departmentid,e.salary) IN(
    SELECT departmentId ,MAx(salary)
FROM Employee
GROUP BY departmentId
);
