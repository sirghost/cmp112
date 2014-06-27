<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:url var="url" value="/upload-cv.html" />
<form:form id="account" modelAttribute="cv" method="POST" action="${url}" enctype="multipart/form-data">			
	<form:input id="form_icon" type="file" path="cvFile" class="file" />
	
	<input type="submit" class="button button-size" value="Upload" />
</form:form>