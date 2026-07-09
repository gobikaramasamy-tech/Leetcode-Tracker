-- Last updated: 7/9/2026, 3:14:42 PM
# Write your MySQL query statement below
select player_id, min(event_date) as first_login
from activity 
group by player_id