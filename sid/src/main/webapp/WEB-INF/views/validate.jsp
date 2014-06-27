<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script src="<c:url value='/static/js/validate.js'/>" type="text/javascript"></script>

<div id="idSolrData">
</div>

<form:form id="validate" modelAttribute="areaDTO">
	<form:hidden id="solrData" path="solrData"/>
	<form:hidden id="cvData" path="cvData"/>
	<div>
		<div id="saveAreasForm" class="button button-size">Save</div>
	</div>
</form:form>