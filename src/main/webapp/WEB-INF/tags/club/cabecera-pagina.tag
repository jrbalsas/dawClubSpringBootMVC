<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<header class="card bg-light">
    <h1 class="ms-5 my-3 fw-bold">
        <%-- Application URL can be obtained with c:url tag or pageContext.request.contextPath EL var --%>
        <a href="<c:url value='/'/>"><img src="${pageContext.request.contextPath}/images/logo.png"></a>
           Club de Tenis
    </h1>
</header>