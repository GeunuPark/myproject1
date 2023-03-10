CREATE TABLE "HR"."BOARD" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITEDATE" DATE, 
	"VIEWCOUNT" NUMBER(38,0), 
	"RECOMMEND" NUMBER(38,0)
   )
   
-- 추천게시판 (recommend)
-- re_no 숫자
-- title, content, writer 문자

CREATE TABLE "HR"."RECOMMEND"
	(
	"re_no" NUMBER(38, 0),
	"TITLE" VARCHAR2(100),
	"CONTENT" VARCHAR2(100),
	"WRITER" VARCHAR2(100)
	)
	
DROP TABLE RECOMMEND -- 테이블을 통째로 삭제한다.

CREATE TABLE "HR"."RECOMMEND"
	(
	"re_no" NUMBER(38, 0),
	"TITLE" VARCHAR2(100),
	"CONTENT" VARCHAR2(100),
	"WRITER" VARCHAR2(100)
	)
	
ALTER TABLE HR.RECOMMEND ADD VIEWCOUNT NUMBER(38,0) NULL;

ALTER TABLE HR.RECOMMEND MODIFY TITLE VARCHAR2(333);

ALTER TABLE HR.RECOMMEND DROP COLUMN VIEWCOUNT;

DROP TABLE BBS


-- DCL = DB를 관리/제어 해주는 문법 (계정 생성, 계정권한 부여, 백업, 복구)

CREATE USER APPLE IDENTIFIED BY a1234

GRANT CONNECT, resource, dba TO APPLE

-- HR.BBS definition

CREATE TABLE "HR"."BBS2" 
   (	"NO" VARCHAR2(100) PRIMARY KEY,
	"TITLE" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"WRITER" VARCHAR2(100) 
   )

INSERT INTO MEMBER VALUES ('100', '100', 'PARK', '011')

INSERT INTO MEMBER VALUES ('200', '200', 'PARK', '011')

INSERT INTO MEMBER VALUES ('300', '300', 'PARK', '011')

SELECT * FROM MEMBER

SELECT * FROM MEMBER WHERE ID = '100'

SELECT ID, NAME FROM MEMBER WHERE ID = '100'

SELECT NAME, ID FROM MEMBER WHERE ID = '100'

SELECT TEL FROM MEMBER WHERE NAME = 'PARK'

UPDATE MEMBER SET NAME = 'KIM' WHERE ID = '100'

UPDATE MEMBER SET NAME = 'LEE' WHERE ID = '200'

UPDATE MEMBER SET NAME = 'YANG' WHERE ID = '300'

UPDATE MEMBER SET PW = '8888', TEL = '999', NAME = 'PARK' WHERE ID = 'ICE'

UPDATE MEMBER SET PW = '1234', TEL = '012', NAME = 'SONG' WHERE ID = 'HELLO'

SELECT * FROM MEMBER WHERE ID = '200' AND TEL = '011'

SELECT * FROM MEMBER WHERE ID = '200' OR TEL = '011'

CREATE TABLE PRODUCT (
	ID VARCHAR2(200),
	NAME VARCHAR2(200),
	CONTENT VARCHAR2(200),
	PRICE VARCHAR2(200),
	COMPANY VARCHAR2(200),
	IMG VARCHAR2(200)
)

SELECT * FROM PRODUCT

SELECT PRICE FROM PRODUCT

SELECT COMPANY FROM PRODUCT

SELECT * FROM PRODUCT WHERE ID = '100'

SELECT * FROM PRODUCT WHERE PRICE = '5000'

SELECT * FROM PRODUCT WHERE ID = '100' AND PRICE = '1000'

SELECT * FROM PRODUCT WHERE COMPANY = 'c100' OR COMPANY = 'c200'

UPDATE PRODUCT SET CONTENT = '품절' WHERE PRICE = '5000'

UPDATE PRODUCT SET IMG = '0.png', PRICE = '10000' WHERE ID = '100' OR ID = '102'

UPDATE PRODUCT SET COMPANY = 'APPLE', NAME = 'APPLESHOES'
WHERE ID = '101'

SELECT * FROM PRODUCT














