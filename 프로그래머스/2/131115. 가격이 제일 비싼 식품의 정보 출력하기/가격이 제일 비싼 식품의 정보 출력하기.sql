-- 코드를 입력하세요
SELECT FP1.PRODUCT_ID, FP1.PRODUCT_NAME, FP1.PRODUCT_CD, FP1.CATEGORY, FP1.PRICE
FROM FOOD_PRODUCT FP1
WHERE FP1.PRICE in
(SELECT MAX(FP2.PRICE)
FROM FOOD_PRODUCT FP2);