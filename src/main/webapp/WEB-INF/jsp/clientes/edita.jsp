<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Edita Cliente</title>
        <link rel="stylesheet"  type="text/css" href="<c:url value='/css/common.css'/>">
        <%@include file="/WEB-INF/layout/bootstrapheader.jspf"%>
    </head>
    <body class="container">
         <%@include file="/WEB-INF/layout/header.jspf" %>
        <main class="row">
        <nav class="col-md-3">
            <h2>Opciones</h2>
            <ul class=" nav nav-pills flex-column">
                <li class="nav-item"><%@include file="/WEB-INF/layout/logoutBt.jspf" %></li>
                <li class="nav-item"><a href="listado" >Volver</a></li>
            </ul>
        </nav>        
            <section class="col-md-6">
        <h1>Editar Cliente</h1>
        <form:form method="POST" modelAttribute="cliente" cssClass="well">
            <h3>Cliente n�: ${cliente.id}</h3>
            <form:label path="nombre" >Nombre:</form:label><form:input class='form-control' path="nombre" />
            <div><form:errors cssClass="form-text text-danger" path="nombre"/></div>
            <form:label path="dni">DNI:</form:label><form:input path="dni" cssClass="form-control"/>
            <div><form:errors cssClass="form-text text-danger" path="dni"/></div>
        <div class="form-check  my-3">
            <form:checkbox path="socio" cssClass="form-check-input" id="iSocio"/>
            <form:label path="socio" cssClass="form-check-label" for="iSocio">Socio</form:label>
        </div>
        <form:label path="medioPago">Medio Pago:</form:label>
            <form:select path="medioPago" cssClass="form-control">
                <c:forEach var="medio" items="${mediosPago}" varStatus="elemento">
                    <form:option value="${elemento.index}"  label="${medio}" />
                </c:forEach>    
            </form:select>
        
        <p>
        <input class="btn btn-primary" name="enviar" type="Submit" value="Guardar">
        <input class="btn btn-default" name="enviar" type="Reset" value="Limpiar">
        <a class="btn btn-default" href="listado">Volver</a>
        </p>
        </form:form>
            </section>
        </main>
        
        <%@include file="/WEB-INF/layout/footer.jspf"%>
    </body>
</html>