-- Last updated: 7/9/2026, 3:17:13 PM
# Write your MySQL query statement below
SELECT
     d.name AS Department,
     e.name AS Employee,
     e.salary AS Salary
FROM (
    SELECT *,
           DENSE_RANK() OVER (
            PARTITION BY departmentId
            ORDER By salary DESC
           ) AS rnk
    FROM Employee
) e
JOIN department d
     ON e.departmentId = d.id
WHERE e.rnk <=3;