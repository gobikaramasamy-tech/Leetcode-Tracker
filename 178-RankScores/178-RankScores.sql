-- Last updated: 7/9/2026, 3:17:24 PM
# Write your MySQL query statement below
SELECT
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS 'rank'
FROM scores
ORDER BY score DESC;