-- Last updated: 7/9/2026, 3:14:45 PM

select p.project_id , ROUND(AVG(e.experience_years),2) as average_years
from Project as p
inner join employee as e 
on p.employee_id = e.employee_id
group by p.project_id

