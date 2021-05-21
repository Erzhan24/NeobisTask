select * from (select distinct city, length(city) from station order by  length(city) ASC, city ASC) where rownum= 1
UNION
select * from (select distinct city, length(city) from station order by  length(city) DESC, city ASC)  where rownum = 1;