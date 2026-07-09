-- Last updated: 7/9/2026, 3:17:16 PM
# Write your MySQL query statement below
SELECT c.name AS customers
FROM customers c
LEFT JOIN orders o
ON c.id = o.customerID
WHERE o.id is NULL;
