<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setBundle basename="messages"/>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title><fmt:message key="appName"/></title>
        <%@include file="/WEB-INF/layout/bootstrapheader.jspf"%>        
    </head>
    <body class="container">
        <header class="jumbotron">
            <h1>Club de Tenis</h1>
        </header>     
        <main class="row" >
        <nav class="col-md-3">
        <h2>Opciones</h2>
        <ul class="nav nav-pills nav-stacked">
            <li class="active"><a href="<c:url value="/clientes"/>" >Gesti�n clientes</a></li>
            <li class="disabled"><a href="instalaciones" >Gesti�n instalaciones</a></li>
            <li class="disabled"><a href="servicios" >Gesti�n servicios</a></li>
        </ul>
        </nav>
        <section class="col-md-9">
        </section>
        </main>
        <%@include file="/WEB-INF/layout/footer.jspf"%>
    </body>
</html>
