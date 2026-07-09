-- Last updated: 7/9/2026, 3:15:23 PM
# Write your MySQL query statement below
SELECT customer_number
FROM Orders 
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1;