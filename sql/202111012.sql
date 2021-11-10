--2021.11.01

--서브쿼리(부속 질의)
-- selct 구문 안에 또 다른 select 구문을 이용하는 sql문

-- SCOTT 사원의 부서 이름 출력
select dame,emp.deptno
from emp,dept
where emp.deptno=dept.deptno and aname = ' SCOTT'
;
select dname
from dept
where deptno=();