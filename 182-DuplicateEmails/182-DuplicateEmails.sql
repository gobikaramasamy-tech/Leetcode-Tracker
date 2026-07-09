-- Last updated: 7/9/2026, 3:17:18 PM
# Write your MySQL query statement below
SELECT email AS Email
FROM person
GROUP BY email
HAVING COUNT(email) >1;