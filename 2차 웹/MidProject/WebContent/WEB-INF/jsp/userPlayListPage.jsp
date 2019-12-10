<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="resImg" value="/MidProject/img/movie"/>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
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
  <link rel="stylesheet" href="css/to-do.css">
  <!-- =======================================================
    Template Name: Dashio
    Template URL: https://templatemag.com/dashio-bootstrap-admin-template/
    Author: TemplateMag.com
    License: https://templatemag.com/license/
  ======================================================= -->
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
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
    
    <!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->
    <!--main content start-->
    <section id="main-content">
      <section class="wrapper site-min-height">
      <div class="row mt" > 
	      <div class="col-md-2">
		      
		   </div>
		   <div class="col-md-8">
				       <div class="showback" style="height:250px; text-align:center">
				              <h4>플레이리스트</h4><br> 
            
				              <!-- Button trigger modal -->	    
				               <div style="text-align:left">
				               	<img src="/MidProject/img/movie/img1.jpg" style="width:200px; height:150px; float:left">
				               	<input type="hidden" id ="listNum" value="${listNum}">
				               		 <h3>LIST NAME: ${listName}</h3> 
				               	</div><br><br><br><br> 
				               <div style="text-align:left">
				               		<button style="float:left" type="button" class="btn btn-danger" onclick="location.href='invoice'" >메인으로</button>	
				               		<button style="float:left" type="button" class="btn btn-primary" data-toggle="modal" data-target="#addMovie">재생목록 추가</button>	
				               	<br><br>
				               </div>
				               <!-- 내가 저장한 리스트 들어오는 영역 -->
				      </div>
				      
				      <div class="row mt" id="listArea" style="display:none; height: 800px" >
				          <div class="col-md-12">
				            <section class="task-panel tasks-widget">
				              <div class="panel-heading">
				                <div class="pull-left">
				                  <h5><i class="fa fa-tasks"></i> Movie List</h5>
				                </div>
				                <br>
				              </div>
				              <div class="panel-body">
				                <div class="task-content">
				                  <ul class="task-list" id="playMvListTarget">
				                   	<%-- <c:set var="i" value="0"/>  
								 	 <c:forEach var="list" items="${playMvList}">
				                      	 <li>
				                      	   <div class="task-checkbox">
										     <input type="checkbox" class="chkbox" id="movie_id${i}" value="${list.movie_number}" />
										   </div>
				                      
				                       <div class="task-title">
				                        	<img src="${resImg}/${list.movievo.movie_image}" style="width:100px; height:50px; text-align:left">
										    <span class="task-title-sp">${list.movievo.movie_title},${list.movie_number}</span>
										    <c:set var="i" value="${i+1}"/> 
				                        <div class="pull-right hidden-phone">
				                          <button class="btn btn-danger btn-xs"><i class="fa fa-trash-o "></i></button>
				                        </div>
				                      </div>
				                       </li>
				                      </c:forEach> --%>
				                   </ul>
				                </div>
				                <div class=" add-task-row">
				                  <a class="btn btn-success btn-sm pull-left" href="todo_list.html#">Add New Tasks</a>
				                  <a class="btn btn-default btn-sm pull-right" href="todo_list.html#">See All Tasks</a>
				                </div>
				              </div>
				            </section>
				          </div>
			          <!-- /col-md-12-->
			        </div>
				  </div><!--  listArea display none end -->    
			</div> <!-- <div class="col-md-8" end> -->
      			
			        
			          
			          
              <!-- Modal 재생목록에 동영상 추가(중앙의 플레이리스트 눌렀을시 모달창) -->
              <div class="modal fade" id="addMovie" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
                <div class="modal-dialog" style="width:800px" >
                  <div class="modal-content">`
                    <div class="modal-header" style="align:center">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true" style="align:center">&times;</button>
                      <h4 class="modal-title" id="myModalLabel">재생목록에 동영상 추가</h4>
                      
                    </div>
                    <div class="modal-body">
                      	재생목록에 동영상 추가 
                      <div>
                      <form class="form-inline" role="form">
		                <div class="form-group">
		                  <label class="sr-only" for="searchMovie">search movie</label>
		                  <input style="width:400px" type="text" class="form-control" id="searchMvKeyword" placeholder="">
		                </div>
		                <button type="button" class="btn btn-default" id="searchBtn" >검색</button>
		              </form>
		              </div>
                      	<!-- <input style="width:400px" class="form-control" type="text" id="searchMovie"><button type="button" class="btn btn-default" >검색</button> -->
	                      	<div class="row mt">
					          <section class="task-panel tasks-widget">
					              <div class="panel-heading">
					                <div class="pull-left">
					                  <h5><i class="fa fa-tasks"></i> 검색 결과 </h5>
					                </div>
					                <br>
					              </div>
					              <div class="panel-body">
					                <div class="task-content">
					                  <ul class="task-list" id="searchTarget">
					                     <!-- 결과창 구현 페이지는 refreshPlayListMv.jsp에 있음 -->
					                  </ul>
					                </div>
					              </div>
					            </section>
					          <div class="modal-footer">
					          	  <button type="button" class="btn btn-default" data-dismiss="modal" >닫기</button>
			                      <button type="button" class="btn btn-primary" id="saveListBtn">저장하기</button>
			                  </div>
	          			<!-- /col-md-12-->
	        			</div>
                    </div>
                    
                  </div>
                </div>
              </div><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
              
              
          </div>
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
        <a href="blank.html#" class="go-top">
          <i class="fa fa-angle-up"></i>
          </a>
      </div>
    </footer>
    <!--footer end-->
  </section>
  <!-- js placed at the end of the document so the pages load faster -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="lib/jquery-ui-1.9.2.custom.min.js"></script>
  <script src="lib/jquery.ui.touch-punch.min.js"></script>
  <script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
  <script src="lib/jquery.scrollTo.min.js"></script>
  <script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
   <!--common script for all pages-->
  <script src="lib/common-scripts.js"></script>
  <script src="lib/tasks.js" type="text/javascript"></script>
  <script src="lib/jquery.tagsinput.js"></script>
  <!--script for this page-->
	 <!--  BASIC BUTTONS -->
	         <!--   <div class="showback">
	             <h4><i class="fa fa-angle-right"></i> Basic Buttons</h4>
	             <button type="button" class="btn btn-default">Default</button>
	             <button type="button" class="btn btn-primary">Primary</button>
	             <button type="button" class="btn btn-success">Success</button>
	             <button type="button" class="btn btn-info">Info</button>
	             <button type="button" class="btn btn-warning">Warning</button>
	             <button type="button" class="btn btn-danger">Danger</button>
	           </div> --> 
<script>
	
	
	function delFunction(id){
		var mvNum = $('#'+id).prev().val(); //foreach 문을 통해 생성된 곳에 저장된 movie_number를 가져오려면
											//동적 id 값을 받아야 했다.(id도 여러개 생기므로) 그것을 처리하기 위한 부분
		
		//console.log($('#'+id).prev().val());   prev() 는 해당 선택자의 이전 형제노드를 찾을때 사용한다.
		$.ajax( {
    	    url: "delMvPlayList?listNum="+${listNum}+"&movie_number="+mvNum ,			
    	    type: 'GET',				//타입
    	    success:function(data){
    	    	$('#playMvListTarget').load("refreshPlayList?listNum="+${listNum});
           	}
    	 });
	}
	if(${playMvList.size()} != 0){
		$('#playMvListTarget').load("refreshPlayList?listNum="+${listNum});
		$('#listArea').show();
	} else {
		$('#listArea').hide();
	}
	$(document).ready(function(){
		
		//$("선택자").prev()
		/*$('#delBtn').click(function(){
			console.log('log');
			console.log($('#delBtn').prev().val());
			 $.ajax( {
        	    url: "delMvPlayList?listNum="+listNum+"&movie_number="+$('#listNum').val() ,			
        	    type: 'GET',				//타입
        	    success:function(data){
        	    	alert('저장되었습니다.');
        	    	mvNumList = '';
        	    	$('#playMvListTarget').load("refreshPlayList?listNum="+${listNum});
               	}
        	  });
		}); */
		
		//재생목록 추가 -> 영상 검색 후 저장하기 눌렀을 시 사용되는 함수
		var mvNumList='';
		$('#saveListBtn').click(function(){
        	$("input[class=chkbox]:checked").each(function() {
        		mvNumList += $(this).val()+',';
        	}); 
        	//ajax 사용, 비동기식으로 필터목록을 업데이트. qq
        	$.ajax( {
        	    url: "instMvPlayList?mvNumList="+mvNumList+"&playListNum="+$('#listNum').val() ,			
        	    type: 'GET',				//타입
        	    success:function(data){
        	    	alert('저장되었습니다.');
        	    	mvNumList = '';
        	    	$('#playMvListTarget').load("refreshPlayList?listNum="+${listNum});
               	}
        	  });
        });
		
		//모달창에서 검색부분 함수
		$('#searchBtn').click(function(){
			if($('#searchMvKeyword').val() == '' ){
        		alert('값을 입력해야 합니다.');
        	} else {
        		$.ajax( {
            	    url: "searchMvCheck?keyword="+$('#searchMvKeyword').val() ,			
            	    type: 'GET',				//타입
            	    success:function(data){
            	    	$('#searchTarget').load("searchMvPrint?keyword="+$('#searchMvKeyword').val());	
            	    	
            	    	if($("#listArea").css("display") == "none"){   
        			        $('#listArea').show();  
	        		    }
            	    }
            	  } );
        	}
		});
		
	
		  
		
	}); //$(document).ready(function 종료 
	
	
	
		//dashio 기본설정부분
	 	$(document).ready(function() {
	      TaskList.initTaskWidget();
	    });

	    $(function() {
	      $("#sortable").sortable();
	      $("#sortable").disableSelection();
	    });
</script>
</body>

</html>
