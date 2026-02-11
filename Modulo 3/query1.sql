select curdate(); -- fecha
select curtime(); -- hora 
select current_timestamp(); -- fecha y hora


-- base de datos on line para practicar
-- https://www.sql-practice.com/

SELECT Upper(first_name) AS Nombre, 
        lower(last_name) Apellido, 
        city as "Nombre Ciudad", 
        len(city) "Cant. Caracteres",
        concat(first_name, ' ', last_name) "Nombre Completo",
        first_name || ' ' || last_name AS "Nom Completo 2"
FROM patients
where gender = 'F'
and allergies is not NULL
and height <= 160
-- AND allergies != 'NULL' -- utf8  ut8_general_ci
order by Upper(last_name) desc


-- Ejercicio 1: Mostrar cuantos pacientes femeninos con alergia a la penicilina nacidos en el año 90 al 99

select count(*) from patients
where gender = "F"
and upper(allergies) = "PENICILLIN"
AND birth_date between '1990-01-01' AND '1999-12-31'
AND birth_date >= '1990-01-01' anD birth_date <= '1999-12-31'
ORDER BY Upper(last_name) desc

select * -- count(*)
from patients
where gender = 'F'
and allergies = 'Penicillin'
and year(birth_date) between 1990 and 1999
order by Upper(last_name) desc



-- Ejercicio 2: buscar como enumerar las filas que devuelve la consulta
select ROW_NUMBER() OVER (order by Upper(last_name)) AS NumeroRegistro, *
from patients
where gender = 'F'
and allergies = 'Penicillin'
and year(birth_date) between 1990 and 1999
order by Upper(last_name) 


-- Ejercicio 3: Mostrar pacientes femeninos con alergia a la penicilina nacidos en el año 90 al 99 
-- y que sean de Toronto y Hamilton

select ROW_NUMBER() OVER (order by Upper(last_name)) AS NumeroRegistro, *
from patients
where gender = 'F'
and allergies = 'Penicillin'
and year(birth_date) between 1990 and 1999
-- and (city = 'Toronto' or city = 'Hamilton')
and city in ('Toronto', 'Hamilton')
order by Upper(last_name) 


-- Ejercicio 4: Mostrar pacientes femeninos con alergia a la penicilina nacidos en el año 90 al 99 
-- y que sean de Toronto y Hamilton
-- ordenar por ciudad y apellido. Enumerar pacientes segun ciudad

select ROW_NUMBER() OVER (PARTITION BY city order by Upper(last_name)) AS NumeroRegistro, *
from patients
where gender = 'F'
and allergies = 'Penicillin'
and year(birth_date) between 1990 and 1999
-- and (city = 'Toronto' or city = 'Hamilton')
and city in ('Toronto', 'Hamilton')
order by city, Upper(last_name) 