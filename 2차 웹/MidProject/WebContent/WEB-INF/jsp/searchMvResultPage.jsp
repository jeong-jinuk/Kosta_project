<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page trimDirectiveWhitespaces="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="resImg" value="/MidProject/img/movie"/>
 
 <li> <c:set var="i" value="0"/>
 	<c:forEach var="list" items="${searchMvList}">
	   <div class="task-checkbox">
	     <input type="checkbox" class="chkbox" id="movie_id${i}" value="${list.movie_number}" />
	   </div>
	   <div class="task-title" >
	   	
	   	<img src="${resImg}/${list.movie_image}" style="width:100px; height:50px; text-align:left">
	     <span class="task-title-sp">${list.movie_title},${list.movie_number}</span>
	     <c:set var="i" value="${i+1}"/> 
	   </div>
   </c:forEach>
 </li>