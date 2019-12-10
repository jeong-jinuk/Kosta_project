<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page trimDirectiveWhitespaces="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="resImg" value="/MidProject/img/movie"/>
 
<c:set var="i" value="0"/>  
 	<c:forEach var="list" items="${playMvList}">
      <li>
	      <div class="task-checkbox">
			  <input type="checkbox" class="chkbox" id="movie_id${i}" value="${list.movie_number}" />
		  </div>
	                  
	      <div class="task-title">
	          <img src="${resImg}/${list.movievo.movie_image}" style="width:100px; height:50px; text-align:left">
			  <span class="task-title-sp">${list.movievo.movie_title},${list.movie_number}</span>
			   
	           <div class="pull-right hidden-phone">
	           	 <input type="hidden" id="mvNumber" value="${list.movie_number}">
	            <button class="btn btn-danger btn-xs" id="delBtn${i}" onclick="delFunction(this.id)"><i class="fa fa-trash-o "></i></button>
	           </div>
	          <c:set var="i" value="${i+1}"/>
	      </div>
	 </li>
   </c:forEach>