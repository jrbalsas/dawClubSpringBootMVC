<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="club" tagdir="/WEB-INF/tags/club"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Alta Cliente</title>
        <link rel="stylesheet"  type="text/css" href="<c:url value='/css/common.css'/>">
        <%@include file="/WEB-INF/layout/bootstrapheader.jspf"%>
    </head>
    <body class="container">
        <club:cabecera-pagina/>
        <main class="row">
        <nav class="col-md-3">
            <h2>Opciones</h2>
            <ul class="nav nav-pills flex-column">
                <li class="nav-item"><club:logout-button/></li>
                <li class="nav-item"><a class="nav-link" href="listado">Volver</a></li>
                
            </ul>
        </nav>
        <section class="col-md-6">
        <h1>Alta Cliente</h1>
        <form:errors path="cliente.*" cssClass="text-danger" element="div" />
        <form:form method="POST" class="well" modelAttribute="cliente" >
            <form:label path="nombre" >Nombre:</form:label><form:input class='form-control' path="nombre" />
            <div><form:errors cssClass="form-text text-danger" path="nombre"/></div>
            <form:label path="dni">DNI:</form:label><form:input class='form-control' path="dni" />
            <div><form:errors cssClass="form-text text-danger" path="dni"/></div>
            <div class="form-check my-3">
                <form:checkbox path="socio" cssClass="form-check-input" id="iSocio"/>
                <form:label path="socio" cssClass="form-check-label" for="iSocio">Socio</form:label>
            </div>
            <form:label path="medioPago">Medio Pago</form:label>
            <form:select path="medioPago" class="form-control">
                <c:forEach var="medio" items="${mediosPago}" varStatus="elemento">
                    <form:option value="${elemento.index}"  label="${medio}" />
                </c:forEach>    
            </form:select>
            <div class="mb-3">
                <label>Fecha Nacimiento:</label>
                    <form:input path="fechaNacimiento" type="date"
                                class="form-control ${status.error?'is-invalid':''}" />
                    <form:errors cssClass='invalid-feedback' path="fechaNacimiento" />
            </div>
            <p>            
                <input name="enviar" type="Submit" value="Guardar" class="btn btn-primary">
                <input name="enviar" type="reset" value="Limpiar" class="btn btn-default">
                <a class="btn btn-default" href="listado">Volver</a>
            </p>
        </form:form>
            </section>
                </main>
        <club:pie-pagina/>
    </body>
</html>