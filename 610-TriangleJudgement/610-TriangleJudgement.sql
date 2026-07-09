-- Last updated: 7/9/2026, 3:15:16 PM
# Write your MySQL query statement below
select x, y, z, 
case when x + y > z and x + z > y and y + z > x then 'Yes'  
     else 'No'  
end as triangle
from Triangle