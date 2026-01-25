<%@tag description="Club footer" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<%@attribute name="message" required="false"%>
<jsp:useBean id="fecha_actual" class="java.util.Date" />

<footer class="card ">
    <div class="card-body bg-light">
        <c:if test="${not empty message}" >
            <p class="text-end">${message}</p>
        </c:if>
        <c:if test="${empty message}" >
            <p class="text-end">Made with <span class="text-danger">&hearts;</span> in DAW</p>
        </c:if>
        <p class="text-end"><fmt:formatDate value="${fecha_actual}" pattern="d MMMM YYYY"/></p>
    </div>
</footer>