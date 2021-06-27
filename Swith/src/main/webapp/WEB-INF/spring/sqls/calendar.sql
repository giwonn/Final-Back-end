DROP TABLE CALENDAR;

CREATE TABLE CALENDAR(
	CALENDAR_ID NUMBER,
	MEMBER_ID NUMBER,
	STUDY_GROUP_ID NUMBER,
	TITLE VARCHAR2(100),
	START_DATE DATE,
	END_DATE DATE,
	CONTENT VARCHAR2(2000),
	REGDATE DATE
);

CREATE TABLE CALENDAR(
	CALENDAR_ID NUMBER PRIMARY KEY,
	MEMBER_ID NUMBER NOT NULL,
	STUDY_GROUP_ID NUMBER NOT NULL,
	TITLE VARCHAR2(100) NOT NULL,
	START_DATE DATE NOT NULL,
	END_DATE DATE NOT NULL,
	CONTENT VARCHAR2(2000) NOT NULL
);

INSERT INTO CALENDAR
VALUES(1, 1, 1, 'TEST', SYSDATE, SYSDATE, 'TEST TEST', SYSDATE);

SELECT * FROM CALENDAR;