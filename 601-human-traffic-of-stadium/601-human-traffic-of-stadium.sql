# Write your MySQL query statement below



select distinct t1.*
from stadium t1, stadium t2, stadium t3
where t1.people >= 100 and t2.people >= 100 and t3.people >= 100
and
(
(t1.id=t2.id-1 and t2.id = t3.id-1)
or (t1.id - t2.id=2 and t3.id-t2.id=1)    
or (t1.id - t2.id=1 and t3.id-t2.id=2)
    
    
)
order by t1.id