<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %> 
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

  <!-- =======================================================
    Template Name: Dashio
    Template URL: https://templatemag.com/dashio-bootstrap-admin-template/
    Author: TemplateMag.com
    License: https://templatemag.com/license/
  ======================================================= -->
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
#chartcontainer {
	min-width: 320px;
	max-width: 600px;
	margin: 0 auto;
}
</style>
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
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->
    <!--main content start-->
    <section id="main-content">
      <section class="wrapper">
        <h3><i class="fa fa-angle-right"></i> My Page</h3>
        <!-- col-lg-6 col-md-6 col-sm-12 -->
        <div class="row mt">
	        <div class="col-lg-6 col-md-9 col-sm-12">
	        
	        <!-----------------				   낭비 심각한 코드들. 튜닝필요....		-------------------->
				       <div class="showback"> 
				             <h4><i class="fa fa-angle-right"></i>나의 인생 영화 </h4>
				             
				             <c:set var="loop_flag" value="false"/>
				             <c:forEach	var="myRankInfo" items="${myRankInfo}" varStatus="status">	
				             		<c:if test="${not loop_flag }">
				             		<c:choose>
			                      		<c:when test="${myRankInfo.gsbvo.rank_name eq 'GOLD'}">
				                        	<div class="alert alert-danger"><b>1위</b>${myRankInfo.movie_title}</div>
				                        	<c:set var="loop_flag" value="true"/>
				                        </c:when>
				                        <c:otherwise>      
				                        	 <c:if test="${status.last}">
				                        	 <div class="alert alert-danger">값이 없습니다. </div>
			                        	 	<c:set var="loop_flag" value="true"/>
			                        	 </c:if>
				                        </c:otherwise>
			                        </c:choose>
			                        </c:if>
			                  </c:forEach>
			                  
			                  <c:set var="loop_flag2" value="false"/>
			                  <c:forEach	var="myRankInfo" items="${myRankInfo}" varStatus="status">
		                      		<c:if test="${not loop_flag2 }">
		                      		<c:choose>	
		                      		<c:when test="${myRankInfo.gsbvo.rank_name eq 'SILVER'}">
			                        	<div class="alert alert-info"><b>2위</b>${myRankInfo.movie_title}</div>
			                        	<c:set var="loop_flag2" value="true"/>
			                        </c:when>
			                        <c:otherwise>      
			                        	<c:if test="${status.last}">
			                        		<div class="alert alert-info">값이 없습니다. </div>
			                        	 	<c:set var="loop_flag2" value="true"/>
			                        	</c:if>
			                        </c:otherwise>
			                      	</c:choose>
			                       </c:if>   
			                  </c:forEach>
			                  
			                  <c:set var="loop_flag3" value="false"/>
			                  <c:forEach	var="myRankInfo" items="${myRankInfo}" varStatus="status">
			                  		<c:if test="${not loop_flag3 }">
			                  		<c:choose>	
		                      		<c:when test="${myRankInfo.gsbvo.rank_name eq 'BRONZE'}">
			                        	<div class="alert alert-success"><b>3위</b>${myRankInfo.movie_title}</div>
			                        	<c:set var="loop_flag3" value="true"/>
			                        </c:when>
			                        <c:otherwise>      
			                        	 <c:if test="${status.last}">
			                        	 	<div class="alert alert-success">값이 없습니다. </div>
			                        	 	<c:set var="loop_flag3" value="true"/>
			                        	 </c:if>
			                        </c:otherwise>
			                       </c:choose>
			                     </c:if>
			                  </c:forEach>
			    <!------------------------------	 튜닝필요한 낭비코드 end	----------------------->
			                    
				       </div> 
				               
		              <!-- 차트부분 -->
		              <div class="showback">        
			          <div id="chartcontainer"></div>
			          <br><br>     
		              <button style="float:center" type="button" class="btn btn-success" id="excelDownBtn">Excel download</button>
		              <button style="float:center" type="button" class="btn btn-success" id="plain" onclick="chartFunction()">일간차트</button>
		              <button style="float:center" type="button" class="btn btn-success" id="inverted">월간차트</button>
		             
		              </div>
            <!--custom chart end   -->    
           
           
        <!-- 사용자 평균 사용금액 차트에서 사용하기 위한 코드.컨트롤러에서 배열 값 여기로 쪼개서 저장함. 하단에 스크립트 단에서 배열 변수에 하나로 합침. -->
        <!-- 역시 낭비가 심하므로 추후 수정 최대갯수도 12개로 제한해야함.chart data		                <c:set var="i" value="0"/>
				         <c:forEach var="soldlist" items="${soldDate}">   
				          	<input type="hidden" id="soldDateid${i}" value="${soldlist}">
				          	<c:set var="i" value="${i+1}"/> 
				         </c:forEach>
				         
				         <c:set var="i" value="0"/>
				          <c:forEach var="avglist" items="${soldAvg}">   
				          	<input type="hidden" id="soldAvgid${i}" value="${avglist}">
				          	<c:set var="i" value="${i+1}"/> 
				         </c:forEach>
				 낭비 차트 코드 end -->
				        
		               
	        </div>
	         
	        	<div class="col-lg-6 col-md-6 col-sm-12">  
		                <!-- REVENUE PANEL -->   
		                <div class="showback" style="overflow:scroll; height: 500px" >
			             <h4><i class="fa fa-angle-right"></i>재생 목록 <button style="float:right" type="button" class="btn btn-primary" data-toggle="modal" data-target="#addPlayList">편집/추가하기</button></h4>
			             <br>
			             <div id="playListDiv">
			             	<!-- 결과창은 refreshPlayList.jsp 에서 출력됨. 비동기식 출력을 위해 이렇게 제작.. -->
			             </div>
			           </div>
			           <div class="showback">
			              <button type="button" style="font-size:15px" class="btn btn-default btn-lg btn-block" onclick="location.href='userMvFilterPage'">추천 영화 필터링 설정</button>
			              <button type="button" style="font-size:15px" class="btn btn-default btn-lg btn-block" onclick="location.href='userInfoPage'">계정 설정</button>
			           </div>
				</div>
		</div>
		
			<!-- Modal 우측 재생목록 추가버튼 누르면 해당 모달창이 출력됨  -->
              <div class="modal fade" id="addPlayList" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                  <div class="modal-content">
                    <div class="modal-header" style="align:center">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true" style="align:center">&times;</button>
                      <h4 class="modal-title" id="myModalLabel">재생목록 추가</h4>
                    </div>
                    <div class="modal-body">
                    <input type="text" id="listName" name="listName" onfocus="if(this.value =='리스트 제목을 입력해 주세요') this.value='';" value="리스트 제목을 입력해 주세요" size="80"><br>
                    </div>

			 <!-- <input type="text" onfocus="if(this.value =='Name') this.value='';" onblur="if(this.value =='') this.value='Name';" value="Name"> -->

                    <div class="modal-footer">
                      <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
                      <button type="button" id="listAddBtn" class="btn btn-primary">추가</button>
                    </div>
                  </div>
              </div>
            </div>
            
            <div class="modal fade" id="delPlayListModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                  <div class="modal-content">
                    <div class="modal-header" style="align:center">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true" style="align:center">&times;</button>
                      <h4 class="modal-title" id="myModalLabel">재생목록 추가</h4>
                    </div>
                    <div class="modal-body">
                    	<h4>플레이리스트를 삭제하시겠습니다? 저장된 영상도 함께 삭제됩니다.</h4>
                    </div>

			 <!-- <input type="text" onfocus="if(this.value =='Name') this.value='';" onblur="if(this.value =='') this.value='Name';" value="Name"> -->

                    <div class="modal-footer">
                      <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
                      <button type="button" id="delListBtn" name="" class="btn btn-danger" onclick="delFunction(this.id)">삭제</button>
                    </div>
                  </div>
              </div>
            </div>
              
		<!-- ------------------------------------재생목록 종료 ----------------------------------------------------- -->
		<!-- ------------------------------------재생목록 종료 ----------------------------------------------------- -->
		
		<!-- ------------------------------------찜리스트 시작 ----------------------------------------------------- -->
		
		<!-- ------------------------------------찜리스트 끝 ----------------------------------------------------- -->
		<!-- ------------------------------------재생리스트 시작 ----------------------------------------------------- -->
		<div class="row mt">
          <div class="col-lg-12">
          <div class="row mt">
          		<!-- 마이페이지 맨 하단에 모든 플레이리스트 출력하는 부분. 플레이리스트 중 영상이 들어있는 플레이리스트만 출력하려다 보니 코드가 길어졌다. -->
       			<c:if test="${ml_list.size() != 0}"> <!-- 리스트가 없으면 초기값 설정시 에러나므로 조건문 설정 -->
       				<c:set var="temp" value="${ml_list.get(0).mylists_name}"/> <!-- 비교값으로 쓸 임시변수에 첫번째 플레이리스트 이름 저장 -->
       				<c:set var="count" value="0" /> <!-- 루프 돌리기 위해 사용한 카운트변수 -->
       				<c:forEach var="ml_listout" items="${ml_list}" >
		       				<c:if test="${count eq 0}"> <!-- 맨처음엔 일단 플레이리스트 이름 하나 출력하게 하고 이후엔 사용하지 않음 -->
								<h3>${ml_listout.mylists_name}</h3><br>
								<c:set var="count" value="1" />
							</c:if>
		       				<c:if test="${ml_listout.mylists_name ne temp}"> 
								<br><h3>${ml_listout.mylists_name}</h3><br>
								<c:set var="temp" value="${ml_listout.mylists_name}"/>
								<c:set var="count" value="1" />
							</c:if>
							
	          			<c:if test="${count eq 1}">    
			          		<c:forEach var="ml_listin" items="${ml_list}">
		          			<c:if test="${ml_listout.mylists_name eq ml_listin.mylists_name}">
			          			<c:forEach  var="innerList" items="${ml_listin.ltList}" >
									<a class="fancybox" href="${resImg}/${innerList.movievo.movie_image}">
										<img style ="width:180px; height:150px" src="${resImg}/${innerList.movievo.movie_image}" alt="">
									</a>
								</c:forEach>
							</c:if>
							</c:forEach>
							<c:set var="count" value="2" />
						</c:if>
					</c:forEach>
				</c:if>
			
          <!-- ------------------------------------재생리스트 종료 ----------------------------------------------------- -->
          <!-- col-lg-4 -->
        </div>
            
          </div>
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
  <!-- js placed at the end of the document so the pages load faster zz -->
  <script>
  //페이지 시작시 차트 데이터를 실행하기 위한 부분. json 데이터를 
  function test(id){
	  $('#delListBtn').attr("name",id);
  }
  
  $(document).ready(function(){
	  chartFunction();
  })

  var soldDate = new Array();
  var soldAvg = new Array();
  $.ajax( {
		url: "./userInfo/chartType/month" ,			
		type: 'GET',				//타입
			success:function(data){
				for(var i=0; i<=data.length-1; i++ ){
				  soldDate[i] = data[i].sold_date;
				  soldAvg[i] = data[i].average;
				}
			}
	});


	//차트 데이터 다운로드
$('#excelDownBtn').click(function(){
	  $.ajax( {
			url: "chartFileDownload" ,			
			type: 'GET',				//타입
				success:function(data){
					alert("다운로드 되었습니다.");
				}
			});
	});	
  
  //처음 페이지 로드시 재생목록을 불러오고 시작.
  $('#playListDiv').load("refresh");
  
  //
  function delFunction(id){
	  	var listNum = $('#'+id).next().val(); //foreach 문을 통해 생성된 곳에 저장된 mylist_name 을 가져오기 위한 변수
	  										//hidden에 저장된 값을 불러온다.
	  	var result = confirm('플레이리스트를 삭제하시겠습니까?  저장된 영상도 함께 삭제됩니다.'); 
	  	if(result) { //yes 
	  		
	  		//console.log($('#'+id).prev().val());   next() 는 해당 선택자의 다음 형제노드를 찾을때 사용한다.
			$.ajax( {
			url: "delPlayList?listNum="+listNum ,			
			type: 'GET',				//타입
				success:function(data){
					$('#playListDiv').load("refresh");
				}
			});
	  	} else { //no 
	  		
	  	}
	}
  
  
  
  $(document).ready(function(){
	  
	  /*재생목록 버튼 추가 버튼 이벤트  */
	    $('#listAddBtn').click(function(){
	    	if($('#listName').val() == '리스트 제목을 입력해 주세요' || $('#listName').val() == '' ){
	    		alert('값을 입력해야 합니다.');
	    	} else {
	    		$.ajax( {
	        	    url: "addPlayList?listName="+$('#listName').val() ,			
	        	    type: 'GET',				//타입
	        	    success:function(data){
	        	    	alert('저장되었습니다.');
	        	    	$('#playListDiv').load("refresh");
	        	    }
	        	});
	    	}
	  	}); 
  });
  
	</script>
    	
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="https://code.highcharts.com/highcharts.js"></script>
  <script src="https://code.highcharts.com/highcharts-more.js"></script>
  <script src="https://code.highcharts.com/modules/exporting.js"></script>
  <script src="lib/highchart_function.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="lib/jquery-ui-1.9.2.custom.min.js"></script>
  <script src="lib/jquery.ui.touch-punch.min.js"></script>
  <script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
  <script src="lib/jquery.scrollTo.min.js"></script>
  <script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
  <script src="lib/jquery.sparkline.js"></script>
  <script src="lib/sparkline-chart.js"></script>
  <!--script for this page-->
  <script src="lib/raphael/raphael.min.js"></script>
  <script src="lib/morris/morris.min.js"></script>
  <!--common script for all pages-->
  <script src="lib/common-scripts.js"></script>
  <!--script for this page-->
  <script src="lib/chart-master/Chart.js"></script>
  <script src="lib/morris-conf.js"></script>
 
  <!--common script for all pages-->
  	


</body>

</html>
