# Write your MySQL query statement below

SELECT t.request_at as Day,
ROUND(COUNT(IF(status!='completed', true, null))  /  COUNT(*), 2) AS "Cancellation Rate"
FROM Trips t

JOIN Users driver ON driver.users_id = driver_id
JOIN Users client ON client.users_id = client_id

WHERE client.banned='No'
AND driver.banned='No'
AND t.request_at BETWEEN "2013-10-01" AND "2013-10-03"

GROUP BY t.request_at
ORDER BY t.request_at  	