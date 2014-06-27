<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Projeto CMP134-14</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" type="text/css" href="<c:url value='/static/css/styles.css'/>" />
        <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/jquery-ui.css"/>" />
        <script src="<c:url value='/static/js/jquery.js' />" type="text/javascript"></script>
		<script src="<c:url value='/static/js/jquery-ui.js' />" type="text/javascript"></script>
		<script src="<c:url value='/static/js/json.min.js' />" type="text/javascript"></script>
    </head>
    <body>
    	<div id="t-container">
			<div id="t-header"><tiles:insertAttribute name="header" /></div>
			
			<div id="t-menu-wrap">
			    <div id="t-menu"><tiles:insertAttribute name="menu" /></div>
			</div>
			<div id="t-content"><tiles:insertAttribute name="content" /></div>
			<div id="clear"></div>
			
			<div id="t-footer"><tiles:insertAttribute name="footer" /></div>
	
		</div>		
		
    </body>
</html>