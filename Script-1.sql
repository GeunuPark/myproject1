CREATE TABLE "HR"."HOBBY2" 
   (	"HOBBYID" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"LOCATION" VARCHAR2(100)
   )
   
INSERT INTO HOBBY1 VALUES (100, 'run', 'seoul')

INSERT INTO HOBBY1 VALUES (200, 'book', 'busan')

SELECT * FROM "HOBBY1"

SELECT CONTENT FROM "HOBBY1"

SELECT CONTENT, LOCATION FROM "HOBBY1"