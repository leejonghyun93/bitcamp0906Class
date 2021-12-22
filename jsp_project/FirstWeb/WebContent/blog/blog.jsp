<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<title>fhoh's BLOG</title>
<link rel="stylesheet" href="css/blog.css">
</head>

<body>

	<!-- 전체 레이아웃을 감싸는 블록 : 가운데 정렬, 보더, 쉐도우 -->
	<div id="main_wrap">
		<!-- header 시작 -->
		<%@ include file="frame/header.jsp"%>
		<!-- header 종료 -->

		<!-- 네비게이션 시작 -->
		<%@ include file="frame/nav.jsp"%>
		<!-- 네비게이션 종료 -->

		<!-- Contents 영역 시작 -->
		<div id="contents_wrap">


			<!-- 게시물 영역 시작 -->
			<section>
				<article>
					<h3 class="title_font margin_tb_5">"위기가 기회로 바뀌고 있다" 힘 받는 美 반도체</h3>
					<div class="margin_tb_5">2021.11.19. 오전 4:51</div>
					<img src="images/blt.jpg" class="margin_tb_5">
					<p class="margin_tb_5 lineheight_180per">미국 대표 자동차 회사들은 자체 반도체
						생산 청사진을 그리고 있다. 엔비디아는 실적 호조에 힘입어 테슬라를 추격하며 시가총액 1조달러를 향해 뜀박질하고 있다.
						반도체 시장 주도권을 노리는 미국의 노림수가 맞아 들고 있음을 시사하는 대목이다. 18일(현지시간)
						월스트리트저널(WSJ)에 따르면 포드와 GM은 반도체 수탁생산업체(파운드리)와 함께 자체 반도체 개발과 생산을 추진
						중이다.</p>
				</article>
				<article>
					<h3 class="title_font margin_tb_5">"위기가 기회로 바뀌고 있다" 힘 받는 美 반도체</h3>
					<div class="margin_tb_5">2021.11.19. 오전 4:51</div>
					<img src="images/blt.jpg" class="margin_tb_5">
					<p class="margin_tb_5 lineheight_180per">미국 대표 자동차 회사들은 자체 반도체
						생산 청사진을 그리고 있다. 엔비디아는 실적 호조에 힘입어 테슬라를 추격하며 시가총액 1조달러를 향해 뜀박질하고 있다.
						반도체 시장 주도권을 노리는 미국의 노림수가 맞아 들고 있음을 시사하는 대목이다. 18일(현지시간)
						월스트리트저널(WSJ)에 따르면 포드와 GM은 반도체 수탁생산업체(파운드리)와 함께 자체 반도체 개발과 생산을 추진
						중이다.</p>
				</article>




			</section>
			<!-- 게시물 영역 종료 -->

			<!-- aside 시작 -->
			<%@ include file="frame/aside.jsp"%>
			<!-- aside 종료 -->

		</div>
		<!-- Contents 영역 종료 -->

		<!-- footer 시작 -->
		<%@ include file="frame/footer.jsp"%>
		<!-- footer 종료 -->



	</div>



</body>

</html>