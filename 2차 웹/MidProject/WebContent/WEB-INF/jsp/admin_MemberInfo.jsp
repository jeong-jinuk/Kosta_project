<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>

<!DOCTYPE html>
<html lang="kr">

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
<link rel="stylesheet" type="text/css"
	href="lib/bootstrap-fileupload/bootstrap-fileupload.css" />
<link rel="stylesheet" type="text/css"
	href="lib/bootstrap-datepicker/css/datepicker.css" />
<link rel="stylesheet" type="text/css"
	href="lib/bootstrap-daterangepicker/daterangepicker.css" />
<link rel="stylesheet" type="text/css"
	href="lib/bootstrap-timepicker/compiled/timepicker.css" />
<link rel="stylesheet" type="text/css"
	href="lib/bootstrap-datetimepicker/datertimepicker.css" />
<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet">
<link href="css/style-responsive.css" rel="stylesheet">

<!-- 테이블 mouseenter 스타일 -->
<style>
.cng {
	color: red;
}

.off-screen {
	display: none;
}

#next {
	width: 500px;
	margin-left: 80%;
}
</style>
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
			<div class="sidebar-toggle-box">
				<div class="fa fa-bars tooltips" data-placement="right"
					data-original-title="Toggle Navigation"></div>
			</div>
			<!--logo start-->
			<a href="index.html" class="logo"><b>DASH<span>IO</span></b></a>
			<!--logo end-->
			<div class="nav notify-row" id="top_menu">
				<!--  notification start -->
				<ul class="nav top-menu">
					<!-- settings start -->
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="index.html#"> <i
							class="fa fa-tasks"></i> <span class="badge bg-theme">4</span>
					</a>
						<ul class="dropdown-menu extended tasks-bar">
							<div class="notify-arrow notify-arrow-green"></div>
							<li>
								<p class="green">You have 4 pending tasks</p>
							</li>
							<li><a href="index.html#">
									<div class="task-info">
										<div class="desc">Dashio Admin Panel</div>
										<div class="percent">40%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-success"
											role="progressbar" aria-valuenow="40" aria-valuemin="0"
											aria-valuemax="100" style="width: 40%">
											<span class="sr-only">40% Complete (success)</span>
										</div>
									</div>
							</a></li>
							<li><a href="index.html#">
									<div class="task-info">
										<div class="desc">Database Update</div>
										<div class="percent">60%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-warning"
											role="progressbar" aria-valuenow="60" aria-valuemin="0"
											aria-valuemax="100" style="width: 60%">
											<span class="sr-only">60% Complete (warning)</span>
										</div>
									</div>
							</a></li>
							<li><a href="index.html#">
									<div class="task-info">
										<div class="desc">Product Development</div>
										<div class="percent">80%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-info" role="progressbar"
											aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
											style="width: 80%">
											<span class="sr-only">80% Complete</span>
										</div>
									</div>
							</a></li>
							<li><a href="index.html#">
									<div class="task-info">
										<div class="desc">Payments Sent</div>
										<div class="percent">70%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-danger"
											role="progressbar" aria-valuenow="70" aria-valuemin="0"
											aria-valuemax="100" style="width: 70%">
											<span class="sr-only">70% Complete (Important)</span>
										</div>
									</div>
							</a></li>
							<li class="external"><a href="#">See All Tasks</a></li>
						</ul></li>
					<!-- settings end -->
					<!-- inbox dropdown start-->
					<li id="header_inbox_bar" class="dropdown"><a
						data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
							<i class="fa fa-envelope-o"></i> <span class="badge bg-theme">5</span>
					</a>
						<ul class="dropdown-menu extended inbox">
							<div class="notify-arrow notify-arrow-green"></div>
							<li>
								<p class="green">You have 5 new messages</p>
							</li>
							<li><a href="index.html#"> <span class="photo"><img
										alt="avatar" src="img/ui-zac.jpg"></span> <span class="subject">
										<span class="from">Zac Snider</span> <span class="time">Just
											now</span>
								</span> <span class="message"> Hi mate, how is everything? </span>
							</a></li>
							<li><a href="index.html#"> <span class="photo"><img
										alt="avatar" src="img/ui-divya.jpg"></span> <span
									class="subject"> <span class="from">Divya Manian</span>
										<span class="time">40 mins.</span>
								</span> <span class="message"> Hi, I need your help with this. </span>
							</a></li>
							<li><a href="index.html#"> <span class="photo"><img
										alt="avatar" src="img/ui-danro.jpg"></span> <span
									class="subject"> <span class="from">Dan Rogers</span> <span
										class="time">2 hrs.</span>
								</span> <span class="message"> Love your new Dashboard. </span>
							</a></li>
							<li><a href="index.html#"> <span class="photo"><img
										alt="avatar" src="img/ui-sherman.jpg"></span> <span
									class="subject"> <span class="from">Dj Sherman</span> <span
										class="time">4 hrs.</span>
								</span> <span class="message"> Please, answer asap. </span>
							</a></li>
							<li><a href="index.html#">See all messages</a></li>
						</ul></li>
					<!-- inbox dropdown end -->
					<!-- notification dropdown start-->
					<li id="header_notification_bar" class="dropdown"><a
						data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
							<i class="fa fa-bell-o"></i> <span class="badge bg-warning">7</span>
					</a>
						<ul class="dropdown-menu extended notification">
							<div class="notify-arrow notify-arrow-yellow"></div>
							<li>
								<p class="yellow">You have 7 new notifications</p>
							</li>
							<li><a href="index.html#"> <span
									class="label label-danger"><i class="fa fa-bolt"></i></span>
									Server Overloaded. <span class="small italic">4 mins.</span>
							</a></li>
							<li><a href="index.html#"> <span
									class="label label-warning"><i class="fa fa-bell"></i></span>
									Memory #2 Not Responding. <span class="small italic">30
										mins.</span>
							</a></li>
							<li><a href="index.html#"> <span
									class="label label-danger"><i class="fa fa-bolt"></i></span>
									Disk Space Reached 85%. <span class="small italic">2
										hrs.</span>
							</a></li>
							<li><a href="index.html#"> <span
									class="label label-success"><i class="fa fa-plus"></i></span>
									New User Registered. <span class="small italic">3 hrs.</span>
							</a></li>
							<li><a href="index.html#">See all notifications</a></li>
						</ul></li>
					<!-- notification dropdown end -->
				</ul>
				<!--  notification end -->
			</div>
			<div class="top-menu">
				<ul class="nav pull-right top-menu">
					<li><a class="logout" href="login.html">Logout</a></li>
				</ul>
			</div>
		</header>
		<!--header end-->
		<!-- **********************************************************************************************************************************************************
        MAIN SIDEBAR MENU
        *********************************************************************************************************************************************************** -->
		<!--sidebar start-->
		<aside>
			<div id="sidebar" class="nav-collapse ">
				<!-- sidebar menu start-->
				<ul class="sidebar-menu" id="nav-accordion">
					<p class="centered">
						<a href="profile.html"><img src="img/ui-sam.jpg"
							class="img-circle" width="80"></a>
					</p>
					<h5 class="centered">Sam Soffes</h5>
					<li class="mt"><a href="index.html"> <i
							class="fa fa-dashboard"></i> <span>메인</span>
					</a></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-desktop"></i> <span>로그 정보</span>
					</a>
						<ul class="sub">
							<li><a href="search_log.html">검색 로그</a></li>
							<li><a href="view_log.html">조회 로그</a></li>
							<li><a href="whatch_log.html">시청 로그</a></li>
							<li><a href="movie_sold_log.html">구매 로그</a></li>
							<li><a href="login_log.html">로그인 로그</a></li>
						</ul></li>
					<li class="sub-menu"><a class="active" href=admin_MemberInfo.html>
							<i class="fa fa-cogs"></i> <span>회원 정보</span>
					</a> <!-- <ul class="sub">
							<li><a href="grids.html">Grids</a></li>
							<li><a href="calendar.html">Calendar</a></li>
							<li><a href="gallery.html">Gallery</a></li>
							<li><a href="todo_list.html">Todo List</a></li>
							<li><a href="dropzone.html">Dropzone File Upload</a></li>
							<li><a href="inline_editor.html">Inline Editor</a></li>
							<li><a href="file_upload.html">Multiple File Upload</a></li>
						</ul> --></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-book"></i> <span>Extra Pages</span>
					</a>
						<ul class="sub">
							<li><a href="blank.html">Blank Page</a></li>
							<li><a href="login.html">Login</a></li>
							<li><a href="lock_screen.html">Lock Screen</a></li>
							<li><a href="profile.html">Profile</a></li>
							<li><a href="invoice.html">Invoice</a></li>
							<li><a href="pricing_table.html">Pricing Table</a></li>
							<li><a href="faq.html">FAQ</a></li>
							<li><a href="404.html">404 Error</a></li>
							<li><a href="500.html">500 Error</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-tasks"></i> <span>Forms</span>
					</a>
						<ul class="sub">
							<li><a href="form_component.html">Form Components</a></li>
							<li><a href="advanced_form_components.html">Advanced
									Components</a></li>
							<li><a href="form_validation.html">Form Validation</a></li>
							<li><a href="contactform.html">Contact Form</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-th"></i> <span>Data Tables</span>
					</a>
						<ul class="sub">
							<li><a href="basic_table.html">Basic Table</a></li>
							<li><a href="responsive_table.html">Responsive Table</a></li>
							<li class="active"><a href="advanced_table.html">Advanced
									Table</a></li>
						</ul></li>
					<li><a href="inbox.html"> <i class="fa fa-envelope"></i> <span>Mail
						</span> <span class="label label-theme pull-right mail-info">2</span>
					</a></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class=" fa fa-bar-chart-o"></i> <span>Charts</span>
					</a>
						<ul class="sub">
							<li><a href="morris.html">Morris</a></li>
							<li><a href="chartjs.html">Chartjs</a></li>
							<li><a href="flot_chart.html">Flot Charts</a></li>
							<li><a href="xchart.html">xChart</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-comments-o"></i> <span>Chat Room</span>
					</a>
						<ul class="sub">
							<li><a href="lobby.html">Lobby</a></li>
							<li><a href="chat_room.html"> Chat Room</a></li>
						</ul></li>
					<li><a href="google_maps.html"> <i
							class="fa fa-map-marker"></i> <span>Google Maps </span>
					</a></li>
				</ul>
				<!-- sidebar menu end-->
			</div>
		</aside>
		<!--sidebar end-->
		<!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->
		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">
				<h3>
					<i class="fa fa-angle-right"></i> 회원 정보
				</h3>
				<div class="row">
					<div class="col-md-12">
						<div class="content-panel">
							<h4>
								<i class="fa fa-angle-right"></i> 회원 리스트
							</h4>
							<hr>
							<table>
								<tr>
									<td style="width: 83%;"><form action="" id="setRows">
											<p>
												&nbsp;데이터 개수 : <input type="text" name="rowPerPage"
													value="5"> 개
											</p>
										</form></td>
									<td><select name="searchType">
											<option value="">선택</option>
											<option value="1">아이디</option>
											<option value="2">이름</option>
									</select> <input type="text" name="searchName">
										<button id="search_ajax">검색</button></td>
								</tr>
							</table>
							<table id="memberlist" class="table table-hover">
								<thead>
									<tr>
										<th>회원 번호</th>
										<th>아이디</th>
										<th>이름</th>
									</tr>
								</thead>
								<tbody>
									<%-- <c:forEach var="e" items="${mlist }">
										<tr>
											<td>${e.member_number}</td>
											<td>${e.member_id }</td>
											<td>${e.member_name }</td>
										</tr>
									</c:forEach> --%>
								</tbody>
							</table>
						</div>
					</div>
					<div class="col-md-12 mt">
						<div class="content-panel">
							<h4>
								<i class="fa fa-angle-right"></i> 상세정보
							</h4>
							<hr>
							<form id="txt"></form>
						</div>
						<!-- page end-->
					</div>
				</div>
				<!-- /row -->
			</section>
			<!-- /wrapper -->
		</section>
		<!-- /MAIN CONTENT -->
		<!--main content end-->

		<!-- Modal -->
		<form class="form-horizontal style-form" method="post"
			action="admin_updateInfo" enctype="multipart/form-data" id="infoForm">
			<div class="modal fade" id="myModal" role="dialog">
				<div style="width: 50%; margin-left: auto; margin-right: auto;">
					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">회원정보 수정</h4>
						</div>
						<div class="modal-body" style="height: 500px;">
							<div class="form-group">
								<label class="control-label col-md-3">프로필 사진</label>
								<div class="col-xs-6 col-md-8">
									<div class="fileupload fileupload-new"
										data-provides="fileupload">
										<div class="fileupload-new thumbnail"
											style="width: 200px; height: 150px;">
											<img src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&text=no+image" alt="" id="member_picture" />

											<%-- <c:choose>
												<c:when test="${member.member_picture == ''}">
													<img
														src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&text=no+image"
														alt="" />
												</c:when>
												<c:otherwise>
													<img src="img/${member.member_picture}" alt="">
												</c:otherwise>
											</c:choose> --%>
										</div>
										<div class="fileupload-preview fileupload-exists thumbnail"
											style="max-width: 200px; max-height: 150px; line-height: 20px;"></div>
										<div>
											<span class="btn btn-theme02 btn-file"> <span
												class="fileupload-new"><i class="fa fa-paperclip"></i>
													Select image</span> <span class="fileupload-exists"><i
													class="fa fa-undo"></i> Change</span> <input type="file"
												class="default" name="mfile" />
											</span>
											<!-- <a href="customerInfo"
											class="btn btn-theme04 fileupload-exists"
											data-dismiss="fileupload"><i class="fa fa-trash-o"></i>
											Remove</a> -->
										</div>
									</div>
									<!-- <span class="label label-info">NOTE!</span> <span>
									Attached image thumbnail is supported in Latest Firefox,
									Chrome, Opera, Safari and Internet Explorer 10 only </span> -->
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 col-sm-2 control-label">이름</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="member_name"
										name="member_name" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 col-sm-2 control-label">비밀번호</label>
								<div class="col-sm-10">
									<input type="password" class="form-control"
										id="member_password" name="member_password">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 col-sm-2 control-label">생일</label>
								<div class="col-sm-10">
									<input type="date" class="form-control" id="member_birth"
										name="member_birth">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 col-sm-2 control-label">회원 등급</label>
								<div class="col-sm-10">
									<input type="number" class="form-control" id="member_grade"
										name="member_grade" min="1" max="9">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 col-sm-2 control-label">회원 활성화 상태</label>
								<div class="col-sm-10">
									<input type="number" class="form-control" id="active_check_number"
										name="active_check_number" min="1" max="2">
								</div>
							</div>
							<input type="hidden" id="member_number" name="member_number">
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary" onclick="submit()">저장</button>
							<button type="button" class="btn btn-default"
								data-dismiss="modal">취소</button>
						</div>
					</div>
				</div>
			</div>
		</form>
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
				<a href="admin_MemberInfo.html#" class="go-top"> <i
					class="fa fa-angle-up"></i>
				</a>
			</div>
		</footer>
		<!--footer end-->
	</section>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
	<script class="include" type="text/javascript"
		src="lib/jquery.dcjqaccordion.2.7.js"></script>
	<script src="lib/jquery.scrollTo.min.js"></script>
	<script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
	<!--common script for all pages-->
	<script src="lib/common-scripts.js"></script>
	<!--script for this page-->
	<script src="lib/jquery-ui-1.9.2.custom.min.js"></script>
	<script type="text/javascript"
		src="lib/bootstrap-fileupload/bootstrap-fileupload.js"></script>
	<script type="text/javascript"
		src="lib/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
	<script type="text/javascript"
		src="lib/bootstrap-daterangepicker/date.js"></script>
	<script type="text/javascript"
		src="lib/bootstrap-daterangepicker/daterangepicker.js"></script>
	<script type="text/javascript"
		src="lib/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
	<script type="text/javascript"
		src="lib/bootstrap-daterangepicker/moment.min.js"></script>
	<script type="text/javascript"
		src="lib/bootstrap-timepicker/js/bootstrap-timepicker.js"></script>
	<script src="lib/advanced-form-components.js"></script>
	<!--common script for all pages-->
	<script>
		function dataSetting() {
			$('#member_number').val($('#m_number').val());
			//var a = $('#m_picture').val()
			//$('#member_picture').attr("scr", a);
			//console.log(a);
			$('#member_name').val($('#m_name').val());
			$('#member_password').val($('#m_pass').val());
			$('#member_birth').val($('#m_birth').val());
			$('#member_grade').val($('#m_grade').val());
			$('#active_check_number').val($('#m_active_check_number').val());
		};

		function submit() {
			$('#infoForm').submit();
		};

		$(function() {
			$("#search_ajax").click(
					function() {

						var searchType = $('[name="searchType"]').val();
						var searchName = $('[name="searchName"]').val();

						console.log(searchType);
						console.log(searchName);

						$.ajax({
							type : "POST",
							url : "./admin_SearchMember?searchType="
									+ searchType + "&searchName=" + searchName,
							// 				data : {name : "홍길동"},
							// 				dataType : "xml",
							success : function(data) {
								$("#memberlist tbody").html(data);
							},
							error : function(xhr, status, error) {
								alert(error);
							}
						});
					});
		});
	</script>
	<!--script for this page-->
</body>
</html>
