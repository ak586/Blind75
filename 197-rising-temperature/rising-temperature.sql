SELECT t2.id
FROM weather t1, weather t2
WHERE t2.temperature > t1.temperature
  AND DATEDIFF(t2.recordDate, t1.recordDate) = 1;
