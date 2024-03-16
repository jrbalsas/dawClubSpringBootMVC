<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%-- Optional Logout button for authenticated users --%>

<c:if test="${not empty pageContext.request.remoteUser}">
    <a class="nav-link border border-danger text-danger" href="<c:url value="/Logout"/>">Desconectar ${pageContext.request.remoteUser}</a>
</c:if>
