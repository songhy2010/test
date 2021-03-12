1. 회원가입한 정보를 저장할 수 있는 'web_member'테이블을 만드시오.
   컬럼명 : email / pw / tel / address
   
create table web_member(
	
	email varchar2(500),
	pw varchar2(500),
	tel varchar2(500),
	address varchar2(500)
   
   )
   
   select * from web_member;
   
   create table Message(
   
   num number,
   send varchar2(500),
   receive varchar2(500),
   content varchar2(500),
   send_date date
   
   
   
   )
   시퀀스 생성
   create sequence num start with 1 increment by 1;
   
   insert into message values(num.nextval, '행보관','나다싶','이번 주 금요일 일일정비', sysdate);
   insert into message values(num.nextval, '군단장','나다싶','호국훈련간다', sysdate);
   select * from MESSAGE;
   
   










