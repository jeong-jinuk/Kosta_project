<%@ page session="false" language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="kr">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="Dashboard">
  <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
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
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #4CAF50;
  color: white;
}
</style>
<style type="text/css">
.form-style-6{
	font: 95% Arial, Helvetica, sans-serif;
	max-width: 400px;
	margin: 10px auto;
	padding: 16px;
	background: #F7F7F7;
}
.form-style-6 h1{
	background: #43D1AF;
	padding: 20px 0;
	font-size: 140%;
	font-weight: 300;
	text-align: center;
	color: #fff;
	margin: -16px -16px 16px -16px;
}
.form-style-6 input[type="text"],
.form-style-6 input[type="date"],
.form-style-6 input[type="datetime"],
.form-style-6 input[type="email"],
.form-style-6 input[type="number"],
.form-style-6 input[type="search"],
.form-style-6 input[type="time"],
.form-style-6 input[type="url"],
.form-style-6 textarea,
.form-style-6 select 
{
	-webkit-transition: all 0.30s ease-in-out;
	-moz-transition: all 0.30s ease-in-out;
	-ms-transition: all 0.30s ease-in-out;
	-o-transition: all 0.30s ease-in-out;
	outline: none;
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	width: 100%;
	background: #fff;
	margin-bottom: 4%;
	border: 1px solid #ccc;
	padding: 3%;
	color: #555;
	font: 95% Arial, Helvetica, sans-serif;
}
.form-style-6 input[type="text"]:focus,
.form-style-6 input[type="date"]:focus,
.form-style-6 input[type="datetime"]:focus,
.form-style-6 input[type="email"]:focus,
.form-style-6 input[type="number"]:focus,
.form-style-6 input[type="search"]:focus,
.form-style-6 input[type="time"]:focus,
.form-style-6 input[type="url"]:focus,
.form-style-6 textarea:focus,
.form-style-6 select:focus
{
	box-shadow: 0 0 5px #43D1AF;
	padding: 3%;
	border: 1px solid #43D1AF;
}

.form-style-6 input[type="submit"],
.form-style-6 input[type="button"]{
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	width: 100%;
	padding: 3%;
	background: #43D1AF;
	border-bottom: 2px solid #30C29E;
	border-top-style: none;
	border-right-style: none;
	border-left-style: none;	
	color: #fff;
}
.form-style-6 input[type="submit"]:hover,
.form-style-6 input[type="button"]:hover{
	background: #2EBC99;
}
</style>

<script>
$(document).ready(function(){

	
	
$("#btnUpdate").click(function(){

	var movie_number = document.updateform.movie_number.value;
	var movie_price = document.updateform.movie_price.value;
	document.updateform.action="update.do"
	document.updateform.submit();

});
	$("#btnSave").click(function(){
		var movie_number = document.addform.movie_number.value;
		var movie_price = document.addform.movie_price.value;
		var movie_title = document.addform.movie_title.value;
		var movie_copyright_cost = document.addform.movie_copyright_cost.value;
		var tag_table_num = document.addform.tag_table_num.value;
		
		document.addform.action="insert.do"
		
		document.addform.submit();
		
	});
	
	$("#btnInsertTag").click(function(){
		document.inserttagform.action="inserttag.do"
		document.inserttagform.submit();
	});
	
	$("#btnUpdateCommunity").click(function(){
		document.updatecommunityform.action="updatecommunity.do"
		document.updatecommunityform.submit();
	});
	
	$("#btnDelete").click(function(){
		
		if(confirm("정말 영화 상태 변경을 하시겠습니까?")){
			var movie_number = document.updatestatusform.movie_number.value;
			var active_check_number = document.updatestatusform.active_check_number;
			document.updatestatusform.action="updatestatus.do"
			document.updatestatusform.submit();
			
		}
	});
	
	
});

</script>

<body>
  <section id="container">
    <!-- **********************************************************************************************************************************************************
        TOP BAR CONTENT & NOTIFICATIONS
        *********************************************************************************************************************************************************** -->
    <!--header start-->
    <header class="header black-bg">
      <div class="sidebar-toggle-box">
        <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
      </div>
      <!--logo start-->
      <a href="index.html" class="logo"><b>DASH<span>IO</span></b></a>
      <!--logo end-->
      <div class="nav notify-row" id="top_menu">
        <!--  notification start -->
        <ul class="nav top-menu">
          <!-- settings start -->
          <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
              <i class="fa fa-tasks"></i>
              <span class="badge bg-theme">4</span>
              </a>
            <ul class="dropdown-menu extended tasks-bar">
              <div class="notify-arrow notify-arrow-green"></div>
              <li>
                <p class="green">You have 4 pending tasks</p>
              </li>
              <li>
                <a href="index.html#">
                  <div class="task-info">
                    <div class="desc">Dashio Admin Panel</div>
                    <div class="percent">40%</div>
                  </div>
                  <div class="progress progress-striped">
                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                      <span class="sr-only">40% Complete (success)</span>
                    </div>
                  </div>
                </a>
              </li>
              <li>
                <a href="index.html#">
                  <div class="task-info">
                    <div class="desc">Database Update</div>
                    <div class="percent">60%</div>
                  </div>
                  <div class="progress progress-striped">
                    <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                      <span class="sr-only">60% Complete (warning)</span>
                    </div>
                  </div>
                </a>
              </li>
              <li>
                <a href="index.html#">
                  <div class="task-info">
                    <div class="desc">Product Development</div>
                    <div class="percent">80%</div>
                  </div>
                  <div class="progress progress-striped">
                    <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                      <span class="sr-only">80% Complete</span>
                    </div>
                  </div>
                </a>
              </li>
              <li>
                <a href="index.html#">
                  <div class="task-info">
                    <div class="desc">Payments Sent</div>
                    <div class="percent">70%</div>
                  </div>
                  <div class="progress progress-striped">
                    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
                      <span class="sr-only">70% Complete (Important)</span>
                    </div>
                  </div>
                </a>
              </li>
              <li class="external">
                <a href="#">See All Tasks</a>
              </li>
            </ul>
          </li>
          <!-- settings end -->
          <!-- inbox dropdown start-->
          <li id="header_inbox_bar" class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
              <i class="fa fa-envelope-o"></i>
              <span class="badge bg-theme">5</span>
              </a>
            <ul class="dropdown-menu extended inbox">
              <div class="notify-arrow notify-arrow-green"></div>
              <li>
                <p class="green">You have 5 new messages</p>
              </li>
              <li>
                <a href="index.html#">
                  <span class="photo"><img alt="avatar" src="img/ui-zac.jpg"></span>
                  <span class="subject">
                  <span class="from">Zac Snider</span>
                  <span class="time">Just now</span>
                  </span>
                  <span class="message">
                  Hi mate, how is everything?
                  </span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="photo"><img alt="avatar" src="img/ui-divya.jpg"></span>
                  <span class="subject">
                  <span class="from">Divya Manian</span>
                  <span class="time">40 mins.</span>
                  </span>
                  <span class="message">
                  Hi, I need your help with this.
                  </span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="photo"><img alt="avatar" src="img/ui-danro.jpg"></span>
                  <span class="subject">
                  <span class="from">Dan Rogers</span>
                  <span class="time">2 hrs.</span>
                  </span>
                  <span class="message">
                  Love your new Dashboard.
                  </span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="photo"><img alt="avatar" src="img/ui-sherman.jpg"></span>
                  <span class="subject">
                  <span class="from">Dj Sherman</span>
                  <span class="time">4 hrs.</span>
                  </span>
                  <span class="message">
                  Please, answer asap.
                  </span>
                  </a>
              </li>
              <li>
                <a href="index.html#">See all messages</a>
              </li>
            </ul>
          </li>
          <!-- inbox dropdown end -->
          <!-- notification dropdown start-->
          <li id="header_notification_bar" class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
              <i class="fa fa-bell-o"></i>
              <span class="badge bg-warning">7</span>
              </a>
            <ul class="dropdown-menu extended notification">
              <div class="notify-arrow notify-arrow-yellow"></div>
              <li>
                <p class="yellow">You have 7 new notifications</p>
              </li>
              <li>
                <a href="index.html#">
                  <span class="label label-danger"><i class="fa fa-bolt"></i></span>
                  Server Overloaded.
                  <span class="small italic">4 mins.</span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="label label-warning"><i class="fa fa-bell"></i></span>
                  Memory #2 Not Responding.
                  <span class="small italic">30 mins.</span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="label label-danger"><i class="fa fa-bolt"></i></span>
                  Disk Space Reached 85%.
                  <span class="small italic">2 hrs.</span>
                  </a>
              </li>
              <li>
                <a href="index.html#">
                  <span class="label label-success"><i class="fa fa-plus"></i></span>
                  New User Registered.
                  <span class="small italic">3 hrs.</span>
                  </a>
              </li>
              <li>
                <a href="index.html#">See all notifications</a>
              </li>
            </ul>
          </li>
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
          <p class="centered"><a href="profile.html"><img src="img/ui-sam.jpg" class="img-circle" width="80"></a></p>
          <h5 class="centered">Sam Soffes</h5>
          <li class="mt">
            <a href="index.html">
              <i class="fa fa-dashboard"></i>
              <span>Dashboard</span>
              </a>
          </li>
          <li class="sub-menu">
            <a href="javascript:;">
              <i class="fa fa-desktop"></i>
              <span>UI Elements</span>
              </a>
            <ul class="sub">
              <li><a href="general.html">General</a></li>
              <li><a href="buttons.html">Buttons</a></li>
              <li><a href="panels.html">Panels</a></li>
              <li><a href="font_awesome.html">Font Awesome</a></li>
            </ul>
          </li>
          <li class="sub-menu">
            <a href="javascript:;">
              <i class="fa fa-cogs"></i>
              <span>Components</span>
              </a>
            <ul class="sub">
              <li><a href="grids.html">Grids</a></li>
              <li><a href="calendar.html">Calendar</a></li>
              <li><a href="gallery.html">Gallery</a></li>
              <li><a href="todo_list.html">Todo List</a></li>
              <li><a href="dropzone.html">Dropzone File Upload</a></li>
              <li><a href="inline_editor.html">Inline Editor</a></li>
              <li><a href="file_upload.html">Multiple File Upload</a></li>
            </ul>
          </li>
          <li class="sub-menu">
            <a class="active" href="javascript:;">
              <i class="fa fa-book"></i>
              <span>Extra Pages</span>
              </a>
            <ul class="sub">
              <li class="active"><a href="blank.html">Blank Page</a></li>
              <li><a href="login.html">Login</a></li>
              <li><a href="lock_screen.html">Lock Screen</a></li>
              <li><a href="profile.html">Profile</a></li>
              <li><a href="invoice.html">Invoice</a></li>
              <li><a href="pricing_table.html">Pricing Table</a></li>
              <li><a href="faq.html">FAQ</a></li>
              <li><a href="404.html">404 Error</a></li>
              <li><a href="500.html">500 Error</a></li>
            </ul>
          </li>
          <li class="sub-menu">
            <a href="javascript:;">
              <i class="fa fa-tasks"></i>
              <span>Forms</span>
              </a>
            <ul class="sub">
              <li><a href="form_component.html">Form Components</a></li>
              <li><a href="advanced_form_components.html">Advanced Components</a></li>
              <li><a href="form_validation.html">Form Validation</a></li>
              <li><a href="contactform.html">Contact Form</a></li>
            </ul>
          </li>
          <li class="sub-menu">
            <a href="javascript:;">
              <i class="fa fa-th"></i>
              <span>Data Tables</span>
              </a>
            <ul class="sub">
              <li><a href="basic_table.html">Basic Table</a></li>
              <li><a href="responsive_table.html">Responsive Table</a></li>
              <li><a href="advanced_table.html">Advanced Table</a></li>
            </ul>
          </li>
          <li>
            <a href="inbox.html">
              <i class="fa fa-envelope"></i>
              <span>Mail </span>
              <span class="label label-theme pull-right mail-info">2</span>
              </a>
          </li>
          <li class="sub-menu">
            <a href="javascript:;">
              <i class=" fa fa-bar-chart-o"></i>
              <span>Charts</span>
              </a>
            <ul class="sub">
              <li><a href="morris.html">Morris</a></li>
              <li><a href="chartjs.html">Chartjs</a></li>
              <li><a href="flot_chart.html">Flot Charts</a></li>
              <li><a href="xchart.html">xChart</a></li>
            </ul>
          </li>
          <li class="sub-menu">
            <a href="javascript:;">
              <i class="fa fa-comments-o"></i>
              <span>Chat Room</span>
              </a>
            <ul class="sub">
              <li><a href="lobby.html">Lobby</a></li>
              <li><a href="chat_room.html"> Chat Room</a></li>
            </ul>
          </li>
          <li>
            <a href="google_maps.html">
              <i class="fa fa-map-marker"></i>
              <span>Google Maps </span>
              </a>
          </li>
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
      <section class="wrapper site-min-height">
     
     	 <div id="edit" class="tab-pane">
                    <div class="row">
                      <div class="col-lg-8 col-lg-offset-2 detailed">
                        <h4 class="mb">영화 관리 페이지</h4>
        <form action="blank5" method="post">
		<fieldset>
			<legend>영화 리스트</legend>
			<!-- 영화 리스트 출력 -->
			<div>
				<table>
					<tbody>
						<tr style=" height: 50px; margin: auto">
							<td>영화번호</td>
							<td>영화제목</td>
							<td>영화가격</td>
							<td>영화개봉날짜</td>
							<td>영화구매날짜</td>
							<td>영화점수</td>
							<td>영화매출</td>
							<td>영화태그</td>
							<td>영화 활성화 번호 </td>
						</tr>
						
						
						<!-- 검색시 영화 리스트 출력 -->
						<c:forEach items="${list }" var="movie2" begin="0" end="10">
							<tr>
								<td>${movie2.movie_number }</td>
								<td>${movie2.movie_title }</td>
								<td>${movie2.movie_price }</td>
								<td>${movie2.movie_open_date }</td>
								<td>${movie2.movie_purchase_date }</td>
								<td>${movie2.movie_rating }</td>
								<td>${movie2.movie_investment }</td>
								<td>${movie2.tag_name }</td>
								<td>${movie2.active_check_number }</td>
							</tr>
						</c:forEach	>
						
					</tbody>
					
					<tfoot>
						<tr>
						<!-- 검색 -->
							<td colspan="6">
							<select name="searchType">
							<c:if test="${empty searchType}">	
								<option value="" selected="selected">선택 </option>
								<option value="1">영화제목 </option>
								<option value="2">활성화 상태 </option></c:if>
							<c:if test="${searchType eq 2}">
								<option value="">선택 </option>
								<option value="1">영화제목 </option>
								<option value="2" selected="selected">활성화 상태 </option></c:if>
							<c:if test="${searchType eq 1}">
								<option value="">선택 </option>
								<option value="1" selected="selected">영화제목 </option>
								<option value="2">활성화 상태</option></c:if>
							</select>
 								<input type="search" name="search"> 
 								<input type="submit" value="검색"></td>
						</tr>
					</tfoot>
				</table>
			</div>
		</fieldset>
	</form>
			
			
			
	  
	</div>
                            
	</div>
	</div>
	


                      
	
	
	<!-- -------------------------------------------------------------------------------------------------------------------------- -->
	    <!--  MODALS1_영화수정 -->
            <div class="showback">
              <!-- Button trigger modal -->
              <button class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal_moviemodify">
               영화 가격 수정
                </button>
              <!-- Modal -->
              <div class="modal fade" id="myModal_moviemodify" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                  <div class="modal-content">
                    <div class="modal-header">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                      <h4 class="modal-title" id="myModalLabel">영화 가격 수정</h4>
                    </div>
                    <div class="modal-body">
                      
                      
                      
                           <div class="form-style-6">
	    <form name="updateform" method="post">
	<div>
	영화 번호 : <input type="text" name="movie_number" id="movie_number" size="20">
	
	</div>

	<div>
	영화 가격 : <input type="text" name="movie_price" id="movie_price" size="20">
	</div>

	<button type="button" id="btnUpdate">수정하기</button>

</form>
                  
                      </div>
                      
                      
                      	
                      	
                      	
                      	<div class="row mt">
          <div class="col-lg-12">
                
             
              	  		
             
            <!-- /form-panel -->
          </div>
          <!-- /col-lg-12 -->
        </div>
                      	
                    </div>
                  </div>
                </div>
              </div>


	<!-- -------------------------------------------------------------------------------------------------------------------------- -->
<!--                MODALS_영화추가 -->

<!--               <button class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal_movieadd"> -->
<!--                영화 추가 -->
<!--                 </button> -->
<!--               <div class="modal fade" id="myModal_movieadd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"> -->
<!--                 <div class="modal-dialog"> -->
<!--                   <div class="modal-content"> -->
<!--                     <div class="modal-header"> -->
<!--                       <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button> -->
<!--                       <h4 class="modal-title" id="myModalLabel">영화 추가</h4> -->
<!--                     </div> -->
<!--                     <div class="modal-body"> -->
                      
                      
                      
                      
                      
                      	
<!--        <div class="form-style-6"> -->
<!--                       	<form name="addform" method="post"> -->
<!--                       	영화코드 : <input type="text" name="movie_number" id="movie_number" size="20">  -->
<!--                       	<br> -->
<!--                       	가격번호 : <input type="text" name="movie_price" id="movie_price" size="20"> -->
<!--                       	<br> -->
<!--                       	영화제목 : <input type="text" name="movie_title" id="movie_title" size="20"> -->
<!--                       	<br> -->
<!--                       	영화판권구입액 : <input type="text" name="movie_copyright_cost" id="movie_copyright_cost" size="20"> -->
<!--                       	<br> -->
<!--                       	영화 장르 : <input type="text" name="tag_table_num" id="tag_table_num" size="20"> -->
<!-- 						<button type="button" id="btnSave">저장하기</button> -->
<!--                       		</form> -->
<!--                       		</div> -->
                      
<!--                     </div> -->
<!--                     <div class="modal-footer"> -->
<!--                       <button type="button" class="btn btn-default" data-dismiss="modal">나가기</button> -->
<!--                     </div> -->
<!--                   </div> -->
<!--                 </div> -->
<!--               </div> -->
       
              
	
	
<!--                   MODALS_영화비활성화-->
<!--               Button trigger modal -->
              <button class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal_moviedelete">
              영화 활성화 상태 변경
<!--                 영화 삭제 -->
                </button>
<!--               Modal -->
              <div class="modal fade" id="myModal_moviedelete" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                  <div class="modal-content">
                    <div class="modal-header">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                      <h4 class="modal-title" id="myModalLabel">영화 활성화 상태 변경</h4>
                    </div>
                    <div class="modal-body">
                       <div class="form-style-6">
                       
                    	<form name="updatestatusform" method="post">
                      	영화코드 : <input type="text" name="movie_number" id="movie_number" size="20"> 
                      	<br>
                      	상태코드 : <input type="text" name="active_check_number" id="active_check_number" size="20">
                      	<br>
                    	<button type="button" id="btnDelete">영화 활성화 상태 변경</button>
                    	
                    	
                    	
                    	
                    	
                    	
                    </form>
                    
                 
</div>
                    
                    
                    
                    
                    </div>
                    <div class="modal-footer">
                      <button type="button" class="btn btn-default" data-dismiss="modal">나가기</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
	
              
              
              
              <!-- 버튼을 누르면 댓글을 태그로 전환해주는 것 -->
              <form name="inserttagform" method="post">
               
						<button type="button" id="btnInsertTag">댓글에서 상위 10개 태그 출력하기</button>
                      		</form>
                      		
                      		
              <!-- 버튼을 누르면 군집화한 내용을 db에 저장시키는 것 -->
              <form name="updatecommunityform" method="post">
              	<button type="button" id="btnUpdateCommunity"> 군집화 내용을 db에 저장하기</button>
              </form>
              
	
	
    <!-- /MAIN CONTENT -->
    <!--main content end-->
    <!--footer start-->
    
    <!--footer end-->
  </section>
</section>


  <!-- js placed at the end of the document so the pages load faster -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
  <script src="lib/jquery.scrollTo.min.js"></script>
  <script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
  <!--common script for all pages-->
  <script src="lib/common-scripts.js"></script>
  <!--script for this page-->
  <script src="lib/jquery-ui-1.9.2.custom.min.js"></script>
  <script type="text/javascript" src="lib/bootstrap-fileupload/bootstrap-fileupload.js"></script>
  <script type="text/javascript" src="lib/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
  <script type="text/javascript" src="lib/bootstrap-daterangepicker/date.js"></script>
  <script type="text/javascript" src="lib/bootstrap-daterangepicker/daterangepicker.js"></script>
  <script type="text/javascript" src="lib/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
  <script type="text/javascript" src="lib/bootstrap-daterangepicker/moment.min.js"></script>
  <script type="text/javascript" src="lib/bootstrap-timepicker/js/bootstrap-timepicker.js"></script>
  <script src="lib/advanced-form-components.js"></script>
</section>





</body>


</html>
