--2021.10.29


desc dual;
select * from dual;

-- 함수 : 단일행 함수, 집합 함수

-- 단일행 함수 : 숫자, 문자, 날짜, 변환

-- 숫자 함수
select ABS(-15.5) from dual;
select FLOOR(35.73) "Floor" FROM DUAL;
select round(15.393)from dual;
select round(15.393,2)from dual;
select round(15.393,-1)from dual;
select trunc(15.6789) from dual;
select trunc(15.6789,2) from dual;
select trunc(15.6789,-1) from dual;
select mod(10,6) from dual;

-- 문자 함수
select LOWER('MR. SCOTT MCMILLAN') "Lowercase" from dual;
select ename, lower(ename) from emp;
select concat('저는 ', '손흥민입니다.')from dual;
select ename || 'is a ' from emp;
select concat('나의 이름은 ', ename) from emp;
select RPAD('Page 1',15,'*') from dual;
select rpad('001111-3',14,'*')from dual;

select SUBSTR('ABCDEFG',3,4) from dual;
select substr('001212-3001234',1,8) from dual;
select substr(hiredate,1,2)from emp;

select rpad(substr('001212-3001234',1,8),14,'*') from dual;
select rpad(substr(name,1,2),5,'*') from customer;
select * from customer;

select Ltrim('     =from=     ') from dual;
select Rtrim('     =from=     ') from dual;

select trim('+' from '+++++from+++++') as a from dual;
select trim('' from '      +++++from+++++     ') as a from dual;

select REPLACE('JACK and JUE','J','BL') from dual;
select replace('000-0000-0000','-',  '')from dual;


-- 날짜 함수
select sysdate from dual;
select sysdate-10 from dual;
select add_months(sysdate,-4) from dual;
select last_day(sysdate) from dual;

-- 변환 함수  
-- 날짜 -> 문자 to_char(원본,패턴)
select to_char(sysdate,'YYYY.MM.DD. day dy AM PM HH HH24:MI:ss')from dual;
-- 2021.10.29.13:00
select to_char(sysdate,'YYYY.MM.DD.HH24:MI')from dual;

select hiredate,to_char(hirdate,'YYYY.MM.DD.') from emp;
-- 숫자 -> 문자 to_char(원본,패턴)
select to_char(100000.12,'0,000,000,000')from dual;
--                     0100000
select to_char(100000,'L9,999,999')from dual;

select to_char(100000.123, 'L9,999,999,9')from dual;

select sal,to_char(sal*1200,'L9,999,999') from emp;

-- 문자 -> 날짜 to-date(원본,패턴)
select to_date('2021-10-25','YYYY-MM-DD') from dual;

-- 2021.01.01 ~ 오늘
select trunc(sysdate - to_date('1993-10-14','YYYY-MM-DD'))from dual;

-- 문자 -> 숫자 to_number(원본,패턴)
select to_number('100,100','9,999,999') + 100000 from dual;
-- *********Page 1 


-- switch case 와 유사한 decode 함수
-- emp 테이블에서 사원 이름, 부서번호,부서이름 출력

select  ename,deptno,
        decode(deptno,
        10, 'ACCOUNT',
        20, 'RESEARCH',
        30, 'SALES',
        40, 'OPERATIONS'
        )as dname
from emp
;

--8. 직급에 따라 급여를 인상하도록 하자. 
-- 직급이 'ANAlYST'인 사원은 5%, 
-- 'SALESMAN'인 사원은 10%, 
--  'MANAGER'인 사원은 15%, 
-- 'CLERK'인 사원은 20%인 인상한다.

select ename,job,sal,
       decode(job,
       'ANALIST',sal+sal*1.05,
       'SALESMAN',sal*1.1,
       'MANAGER',sal*1.15,
       'CLERK',sal*1.2
       ) as upSal
from emp
;

-- case when then : if else if 유사 -> 조건식을 = 이외의 비교 연산을 할 수 있다.

select ename,sal,
    case 
    when sal >= 3000 then sal*1.1
    when sal < 3000 then sal*2
    end as upsal
from emp
;


--------------------------------------
-- 집합 함수 (그룹 함수)
-- 하나의 행의 컬럼이 대상이 아니고,행 그룹의 컬럼들(집합)이 대상
--------------------------------------
select
   to_char (sum(sal)*1200, 'L999,999,999')as "월 급여 총액",
   to_char (round(avg(sal)*1200), 'L999,999,999') as "월 급여 평균",
   count(*) as " 총 사원의 수",
   count(comm) as " 커미션 등록 수 ",
   sum(comm) as "커미션 합",
   avg(comm) as "커미션 평균",
   max(sal) as " 가장 높은 급여",
   min(sal) as " 가장 낮은 급여"
from emp
;


-- 사원들의 업무의 개수
select count(distinct job) from emp;

-- 각 부서의 
select  sum(sal)
from emp
where deptno = 10
;
select  sum(sal)
from emp
where deptno = 20
;
select  sum(sal)
from emp
where deptno = 30
;
select * from emp order by deptno;

-- group by : 특정 컬럼으로 그룹핑 -> 그룹내의 평균이나 합과 같은 집합 함수를 사용할 수 있다

-- 부서번호를 기준으로 그룹핑 
-- -> 급여의 총합,평균,최대,최소, 사원의 수, 
-- 커미션 받는 사람,커미션 평군,커미션 총합
select deptno,
    count(*) as "사원 수",
    sum(sal) as "급여 총합",
    trunc(avg(sal)) as " 급여 평균",
    max as "최대 급여",
    min as "최소 급여",
    count(*) as " 커미션 대상자 수",
    nvl(sum(comm),0) as "커미션 총합",
    nvl(avg(comm),0) as "커미션 평균"
from emp
;
--where deptno != 20
group by deptno
-- having avg(sal) >= 2000
having max(sal) > 2900
order by deptno
;