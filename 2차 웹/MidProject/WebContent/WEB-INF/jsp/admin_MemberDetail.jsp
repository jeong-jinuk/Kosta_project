<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <c:set var="resImg" value="/midproject/WebContent/img"/>
 --%> 
<!DOCTYPE html>
<form action="/admin_updateInfo" method="post" enctype="multipart/form-data"
	id="infoForm">
	<div style="margin-left: 20%;">
		<img src="img/${member.member_picture }">
	</div>
	<div>
		<ul>
			<li>번호 : ${member.member_number}</li>
			<li>아이디 : ${member.member_id }</li>
			<li>이름 : ${member.member_name }</li>
			<li>비밀번호 : ${member.member_password }</li>
			<li>생일 : ${member.member_birth}</li>
			<li>회원 등급 : ${member.member_grade }</li>
			<li>총 결제금액 : ${member.movie_sold_log[0].price.movie_real_price}</li>
			<li>최근 로그인 : ${member.login_log[0].loginlog_logout }</li>
			<li>총 방문횟수 : ${member.login_log[0].loginlog_login }</li>
			<li>총 시청횟수 : ${member.watch_log[0].watchlog_date }</li>
			<li>활성화 상태 : ${member.active_check_number }</li>
		</ul>
		<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
			data-target="#myModal" onclick="dataSetting()">수정</button>
	</div>
	<input type="hidden" id="m_number" value="${member.member_number}">
	<input type="hidden" id="m_picture" value="img/${member.member_picture}">
	<input type="hidden" id="m_name" value="${member.member_name }">
	<input type="hidden" id="m_pass" value="${member.member_password }">
	<input type="hidden" id="m_birth" value="${member.member_birth }">
	<input type="hidden" id="m_grade" value="${member.member_grade }">
	<input type="hidden" id="m_active_check_number" value="${member.active_check_number }">
</form>
