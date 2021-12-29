# Write your MySQL query statement below
select firstName, lastName, a.city, a.state
from Person
left JOIN Address AS a using(personId);