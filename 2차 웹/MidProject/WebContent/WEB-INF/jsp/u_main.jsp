<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<c:set value="${pageContext.request.contextPath}/resources/img" var="resimg"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Dashboard">
<meta name="keyword"
	content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
<title>Dashio - Bootstrap Admin Template</title>

<!-- Favicons -->
<link href="img/favicon.png" rel="icon">
<link href="img/apple-touch-icon.png" rel="apple-touch-icon">

<!-- Bootstrap core CSS -->
<link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!--external css-->
<link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet">
<link href="css/style-responsive.css" rel="stylesheet">

<!-- =======================================================
    Template Name: Dashio
    Template URL: https://templatemag.com/dashio-bootstrap-admin-template/
    Author: TemplateMag.com
    License: https://templatemag.com/license/
  ======================================================= -->
</head>

<body>
	<section id="container">
		<!-- **********************************************************************************************************************************************************
        TOP BAR CONTENT & NOTIFICATIONS
        *********************************************************************************************************************************************************** -->
		<!--header start-->
		<header class="header black-bg">
			<!--logo start-->
			<a href="u_main.html" class="logo"><b>Wa<span>flex</span></b></a>
			<!--logo end-->
			<div class="nav notify-row" id="top_menu">
			</div>
			<div class="top-menu">
				<ul class="nav pull-right top-menu">
				<li>
				<c:choose>
					<c:when test="${sessionScope.uid == null }">
					<!-- 세션에 데이터가 존재하는지 확인하여 회원가입 혹은 마이페이지로 분기시킨다. -->
						<a href="u_joinin" class="logout">회원가입</a>
					</c:when>
					<c:otherwise>
						<c:choose>
							<c:when test="${sessionScope.grade > 4 }"><!-- 유저의 등급에 따라 관리페이지 분기 -->
								<a href="admin" class="logout">${sessionScope.uname}님 관리</a>
							</c:when>
							<c:otherwise><!-- 임시 링크. 추후 수정해야함. ks 190329 -->
								<a href="invoice" class="logout">${sessionScope.uname}님 유저</a>
							</c:otherwise>
						</c:choose>
					</c:otherwise>					
				</c:choose>
				</li>
				</ul>
				<ul class="nav pull-right top-menu">
					<li>
					<c:choose>
					<c:when test="${sessionScope.uid==null }">
					<!-- 로그인 시에 세션에 id와 이름을 저장해두므로 세션이 비어있다면 로그인버튼이 뜨고,
						세션에 값이 들어가있으면 로그아웃 버튼이 뜨게 만들어두었다. -->
						<a class="logout" href="u_login.html">LogIn</a>
					</c:when>
					<c:otherwise>
						<a class="logout" href="u_logout">LogOut</a>
					</c:otherwise>
				</c:choose>
					</li>
				</ul>
			</div>
			<div class="chat-room mt">
			<div class="chat-room-head" style="height: 30px">
			<select id="selectsearch" 
			style="width: 90px; height:30px; 
			background: #34495e;
			margin-top: 2px;">
             	<option value="0">---</option>
             	<option>장르</option>
             	<option>배우</option>
             	<option>제목</option>
             	<option>감독</option>
             </select>
             <input type="text" id="search" placeholder="Search" 
             style="background: #34495e; width: 250px; height:30px;
             padding:0 5px 0 35px; ">
              </div>
              </div>
		</header>
		<!--header end-->
		<!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->
		<!--main content start-->
		<section id="main-content">
			<section class="wrapper site-min-height" style="background: black">
<!-- 				<H3> -->
<!-- 					<I CLASS="FA FA-ANGLE-RIGHT"></I>  -->
<!-- 				</H3> -->
				<br/><br/><br/><br/>
				<div id = "searchtarget">
				<div class="row mt" style="color:white; font-size: 25px;">
					<div class="col-lg-12">
						<p>인기영상 탑5</p>
						<div class="movies">
		<table>
			<tr>
				<c:forEach var="src_list" items="${list_popular}">
					<td>
						<table>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">
								<img src="${src_list[2]}" title="${src_list[1]}" id="${src_list[0]}">
								</div></td>
							</tr>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">${src_list[1]}</div></td>
							</tr>
						</table>
					<td>
				</c:forEach>
			</tr>
		</table>
	</div>
						<br/>
					</div>
					<div class="col-lg-12">
						<p>상영중 탑5</p>
						<div class="movies">
		<table>
			<tr>
				<c:forEach var="src_list" items="${list_boxOffice}">
					<td>
						<table>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">
								<img src="${src_list[2]}" title="${src_list[1]}" id="${src_list[0]}">
								</div></td>
							</tr>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">${src_list[1]}</div></td>
							</tr>
						</table>
					<td>
				</c:forEach>
			</tr>
		</table>
	</div>
						<br/>
					</div>
					<div class="col-lg-12">
						<p>최근조회</p>
						<div class="movies">
		<table>
			<tr>
				<c:forEach var="src_list" items="${list_lastviewed}">
					<td>
						<table>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">
								<img src="${src_list[2]}" title="${src_list[1]}" id="${src_list[0]}">
								</div></td>
							</tr>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">${src_list[1]}</div></td>
							</tr>
						</table>
					<td>
				</c:forEach>
			</tr>
		</table>
	</div>
						<br/>
					</div>
					<div class="col-lg-12">
						<p>찜리스트</p>
						<div class="movies">
		<table>
			<tr>
				<c:forEach var="src_list" items="${list_saved}">
					<td>
						<table>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">
								<img src="${src_list[2]}" title="${src_list[1]}" id="${src_list[0]}">
								</div></td>
							</tr>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">${src_list[1]}</div></td>
							</tr>
						</table>
					<td>
				</c:forEach>
			</tr>
		</table>
	</div>
						<br/>
					</div>
					<div class="col-lg-12">
						<p>유료추천</p>
						<div class="movies">
		<table>
			<tr>
				<c:forEach var="src_list" items="${list_pay}">
					<td>
						<table>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">
								<img src="${src_list[2]}" title="${src_list[1]}" id="${src_list[0]}">
								</div></td>
							</tr>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">${src_list[1]}</div></td>
							</tr>
						</table>
					<td>
				</c:forEach>
			</tr>
		</table>
	</div>
						<br/>
					</div>
					<div class="col-lg-12">
						<p>무료추천</p>
						<div class="movies">
		<table>
			<tr>
				<c:forEach var="src_list" items="${list_free}">
					<td>
						<table>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">
								<img src="${src_list[2]}" title="${src_list[1]}" id="${src_list[0]}">
								</div></td>
							</tr>
							<tr align="center">
								<td><div title="${src_list[1]}" id="${src_list[0]}">${src_list[1]}</div></td>
							</tr>
						</table>
					<td>
				</c:forEach>
			</tr>
		</table>
	</div>
						<br/>
					</div>
					<div class="col-lg-12">
						<p>유저가 선호하는 영화와 비슷한 영화들</p>
						<div id="likegenremovie">10개</div>
						<br/>
					</div>
					<div class="col-lg-12">
						<p>비슷한 성향의 유저가 많이 본 영화들</p>
						<div id="liketendencymovie">10개</div>
						<br/>
					</div>
				</div>
				</div>
				<!-- Modal 이벤트 테이블과 연동하여 이벤트가 있으면 모달창에 띄워준다. 미완성 -->
				<div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog"
					tabindex="-1" id="eventModal" class="modal fade">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">EVENT</h4>
							</div>
							<div class="modal-body" id="modal-body">
							</div>
							<div class="modal-footer">
								<button data-dismiss="modal" class="btn btn-default"
									type="button">Cancel</button>
							</div>
						</div>
					</div>
				</div>
				<!-- modal -->
			</section>
			<!-- /wrapper -->
		</section>
		<!-- /MAIN CONTENT -->
		<!--main content end-->
		<!--footer start-->
		<footer class="site-footer">
			<div class="text-center">
				<p>
					&copy; Copyrights <strong>Dashio</strong>. All Rights Reserved
				</p>
				<div class="credits">
					<!--
            You are NOT allowed to delete the credit link to TemplateMag with free version.
            You can delete the credit link only if you bought the pro version.
            Buy the pro version with working PHP/AJAX contact form: https://templatemag.com/dashio-bootstrap-admin-template/
            Licensing information: https://templatemag.com/license/
          -->
					Created with Dashio template by <a href="https://templatemag.com/">TemplateMag</a>
				</div>
				<a href="blank.html#" class="go-top"> <i class="fa fa-angle-up"></i>
				</a>
			</div>
		</footer>
		<!--footer end-->
	</section>
	<!-- js placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
	<script src="lib/jquery-ui-1.9.2.custom.min.js"></script>
	<script src="lib/jquery.ui.touch-punch.min.js"></script>
	<script class="include" type="text/javascript"
		src="lib/jquery.dcjqaccordion.2.7.js"></script>
	<script src="lib/jquery.scrollTo.min.js"></script>
	<script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
	<!--common script for all pages -->
	<script src="lib/common-scripts.js"></script>
	<script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
	<!--script for this page-->
	<script>
		$(document).ready(function(){
			event();
			$(window).on('load',function(){
		        $('#eventModal').modal('show');
		    });
			$('#btn-close-dialog').click(function() {
				$('#my-dialog,#dialog-background').hide();
		 	});
			$('#search').keypress(function(event) {//특정 키가 입력되었을때 발동하는 이벤트
				if(event.keyCode == 13){
					var selectsearch = $('#selectsearch').val();
					var text = $('#search').val();
					console.log(text);
					console.log(selectsearch);
					if(selectsearch != 0){
						search(selectsearch,text);
					}else if(selectsearch == 0){
						alert('카테고리를 선택해주세요');
					}
				}
			});
			});
		function liketendencymovie() {
			$.getJON("",function(){
				
			});
		}
		function event() {
			$.ajax({
				url:"u_event",
				success: function(event) {
					console.log(event);
					if(event != null && event !=""){ 
						$('#modal-body').html('<li><img src="${resimg}/'+event+'"></li>');
					}else{
						$('#modal-body').html("특별한 이벤트가 없습니다.");
					}
				}
			});
		}	
		function search(selectsearch,text) {
			$.ajax({//검색을 ajax통신을 통해 비동기식으로 처리한다.
				url:"u_search?selectsearch="+selectsearch+"&search="+text,
				success: function(response) {
					var obj = "";
					obj=response;
					console.log(obj);
					var res = JSON.parse(obj);

					$('#searchtarget').html(function() {
						let html="";
						$.each(res,function(key,value){
							html+='<li>'+value+'</li>';
						})
						return html;
						});

				},
				error: function(error)
				   {
				     alert( "검색내용이 존재하지 않습니다."+error );
				   }
					});
				}
 	</script>
</body>

</html>