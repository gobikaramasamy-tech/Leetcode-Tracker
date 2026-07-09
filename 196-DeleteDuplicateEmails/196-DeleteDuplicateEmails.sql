-- Last updated: 7/9/2026, 3:17:09 PM
# Write your MySQL query statement below
DELETE p FROM Person p
JOIN Person p2 
ON p.Email = p2.Email AND p.Id > p2.Id;
