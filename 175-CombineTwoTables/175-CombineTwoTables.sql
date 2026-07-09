-- Last updated: 7/9/2026, 3:17:29 PM
# Write your MySQL query statement below
SELECT
      p.firstname,
      p.lastname,
      a.city,
      a.state
FROM person p
LEFT JOIN Address a
ON p.personId =a.personId;
