select rownum,ename,hiredate from emp order by hiredate;

select rownum,ename ,hiredate
from(select * from emp order by hiredate)-- 인라인뷰
where rownum <= 5
;

-- 급여액 top3
select rownum ename,sal,job
from(select*from emp order by sal desc)
where rownum <= 3
;

-- 게시물의 리스트
-- 회원 리스트
-- 1.page = 10 => 1~10
-- 2.page = 10 => 11~20

-- 입사일 기준으로 정렬한 가상 테이블
create or replace view emp_hir
as
select * from emp order by hiredate
;

