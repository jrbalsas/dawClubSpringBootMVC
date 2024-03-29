<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="club" tagdir="/WEB-INF/tags/club"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Listado de Clientes</title>
        <link rel="stylesheet"  type="text/css" href="<c:url value='/css/common.css'/>">        
        <%@include file="/WEB-INF/layout/bootstrapheader.jspf"%>
    </head> 
    <body class="container">
    <club:cabecera-pagina/>
        <main class="row">
            <nav class="col-md-3">
                <h2>Opciones</h2>

                <ul class=" nav nav-pills flex-column">
                    <li><club:logout-button/></li>

                    <li class="nav-item"><a href='<c:url value="/clientes/crea"/>' class="nav-link">Nuevo Cliente</a></li>
                </ul>
            </nav>
            <section class="col-md-9">
                <h2>Listado de Clientes (JSTL)</h2>
                <c:if test="${empty clientes}">
                    NO HAY CLIENTES DISPONIBLES
                </c:if>
                <c:if test="${not empty clientes}">
                    <table class="table table-striped">
                        <tr><th>ID</th><th>Nombre</th><th>DNI</th><th>Socio</th>
                            <th>Medio Pago</th><th>Opciones</th></tr>
                        <c:url var="ctrlUrl" value="/clientes"/> 
                                <c:forEach var="c" items="${clientes}">
                                    <c:set var="qry" value="?id=${c.id}"/>
                            <tr>
                                <td>${c.id}</td>
                                <td>${c.nombre}</td><td>${c.dni}</td>
                                <td>${c.socio?"Sí":"No"}</td>
                                <td>${mediosPago[c.medioPago]}</td>
                                <td><a class='btn btn-light btn-sm' href='${ctrlUrl}/visualiza${qry}'>Ver</a>&nbsp;
                                    <a class='btn btn-light btn-sm' href='${ctrlUrl}/edita${qry}'>Editar</a>&nbsp;
                                    <a class='btn btn-light btn-sm' href='${ctrlUrl}/borra${qry}'>&#x1f5d1;</a>&nbsp;
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </c:if>
            </section>
        </main>
    <club:pie-pagina/>
    </body>
</html>