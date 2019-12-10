<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page trimDirectiveWhitespaces="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="i" value="0"/> 
  <c:forEach var="mvNamelist" items="${mvNamelist}">
  	<div class="alert alert-warning"><b>${mvNamelist.mylists_name}</b> 
   	<div class="pull-right hidden-phone">
               <button class="btn btn-success btn-xs" onclick="location.href='userListEditPage?listName=${mvNamelist.mylists_name}&listNum=${mvNamelist.mylists_number}'"><i class=" fa fa-check"></i></button>
               <button class="btn btn-primary btn-xs"><i class="fa fa-pencil"></i></button>
               <button class="btn btn-danger btn-xs" id="delBtn${i}" onclick="test(this.id)" data-toggle="modal" data-target="#delPlayListModal"><i class="fa fa-trash-o "></i></button>
               <input type="hidden" value="${mvNamelist.mylists_number}">
   </div>
	<c:set var="i" value="${i+1}"/>
  	</div>
  </c:forEach>
 <%--  <button class="btn btn-danger btn-xs" id="delBtn${i}" onclick="delPlayListModal(this.id)" data-toggle="modal" data-target="#addPlayList"> --%>