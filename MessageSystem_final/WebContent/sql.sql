1. ȸ�������� ������ ������ �� �ִ� 'web_member'���̺��� ����ÿ�.
   �÷��� : email / pw / tel / address
   
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
   ������ ����
   create sequence num start with 1 increment by 1;
   
   insert into message values(num.nextval, '�ຸ��','���ٽ�','�̹� �� �ݿ��� ��������', sysdate);
   insert into message values(num.nextval, '������','���ٽ�','ȣ���Ʒð���', sysdate);
   select * from MESSAGE;
   
   










