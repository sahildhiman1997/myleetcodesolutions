


select

(case
 when id%2=1 and id=total then id
 when id%2=1 then id+1
 when id%2=0 then id-1
end
)
id
, student from(

select id ,student, ( select count(*)   from seat) as total from seat )as ss
order by id