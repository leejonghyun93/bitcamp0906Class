

--2021.11.02

--중첩 질의

-- 평균 급여보다 더 많은 급여를 받는 사원을 검색하는 문장
select avg(sal) from  emp;

-- 2073.214285714285714285714285714285714286
select ename,sal
from emp
where sal>(select avg(sal) from emp)
;

-- 평균 주문금액 이하의 주문에 대해서 주문번호와 금액을 보이시오.
-- 평균 주문금액
select avg(saleprice)from orders;
-- 주문금액 이하의 주문에 대해서 주문번호와 금액
select orderid,saleprice 
from orders
where saleprice <= (select avg(saleprice)from orders)
;

-- 각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해서 주문번호,고객번호,금액을 보이시오
-- 각 고객의 주문금액
-- 조건: 각 고객의 평균 주문금액보다 큰 금액의 주문 내역
-- 주문 내역에 대해서 주문번호,고객번호,금액을 보이시오
select avg(saleprice) from orders where custid = 1;

select custid,orderid,saleprice
from orders O
where saleprice >(
      select avg(saleprice) from orders OA where OA. custid = O.custid
      )
;

-- 다중행 서브 쿼리
-- IN,SOME,ANY,ALL,EXITS

-- 3000이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원

select distinct(deptno) from emp where sal>=3000;
select * from emp where deptno = 10 or deptno =20;

select *
from emp 
where deptno in(
select distinct(deptno) from emp where sal>=3000
);

-- 3번 고객이 주문한 도서의 최고 금액보다 더 비싼 도서를 구입한 주문의 주문번호와 금액을 보이시오
-- 3버 고객의 주문 도서의 금액들
select saleprice from orders where custid =3;
-- 더 비싼 도서를 구입한 주문의 주문번호와 금액을 보이시오
select saleprice 
from orders
where saleprice > all(
select saleprice from orders where custid =3
)
;
-- 6000
-- 12000
-- 13000

-- 부서번호가 30번인 사원들의 급여 중 가장 작은 값(950)보다 많은 급여를 받는 사원의 이름,급여를 
-- 부서버노가 30번인 사원들의 급여
select sal from emp where deptno=30;
-- 급여 중 가장 작은 값(950)보다 많은 급여를 받는 사원의 이름,급여를
select ename, sal
from emp
where sal > any (select sal from emp where depto =30)
;
-- 2850
-- 1600
-- 1250
-- 1500
-- 950
-- 30번 소속 사원들 중에서 급여를 가장 많이 받는 사원보다 

 -- 30번 소속 사원들 중에서 급여를 가장 많이 받는 사원보다  
-- 더 많은 급여를 받는 사람의 이름, 급여를 출력하는 쿼리문 

 
 -- 30번 부서의 사원들의 급여 
 select sal from emp where deptno=30; 
-- 조건 : 30번 부서의 초고 급여보다 큰 급여를 받는 사원 
-- 이름과 급여 출력 
select ename, sal 
from emp 
 where sal > all (select sal from emp where deptno=30) 
 ; 
 
 
select ename, sal 
from emp 
where sal > (select max(sal) from emp where deptno=30) 
 ; 
 select max(sal) from emp where deptno=30; 

 

 
-- EXISTS 연산자로 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오. 
 --EXISTS 연산자로 대한민국에 거주하는 고객 
 select * from customer where address like '%대한민국%' and custid=3; 
 
 
 select sum(saleprice) 
 from orders o 
 where EXISTS ( 
 select *  
 from customer  c 
where address like '%대한민국%' and c.custid=o.custid 
    ) 
 ; 
