-- 코드를 입력하세요
SELECT COUNT(*)
FROM (SELECT *
             FROM USER_INFO
             WHERE AGE IS NULL) as USERS