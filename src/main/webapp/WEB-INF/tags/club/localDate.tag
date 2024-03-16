<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<%-- Util tag for formatting LocalDate ISO values--%>

<%@ attribute name="value" description="Local date value" 
			  required="true" %>
<%@ attribute name="pattern" description="Java SimpleDateFormat pattern" 
			  required="false" %>

<c:set var="pattern" value="${(empty pattern) ? 'dd-MM-yyyy' : pattern}" />

<fmt:parseDate value="${value}" type="date" pattern="yyyy-MM-dd"
	var="parsedDate" />
<fmt:formatDate value="${parsedDate}" type="date" pattern="${pattern}"/>
