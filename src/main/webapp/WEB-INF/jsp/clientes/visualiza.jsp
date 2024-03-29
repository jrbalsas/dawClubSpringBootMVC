<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="club" tagdir="/WEB-INF/tags/club" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Visualiza Cliente </title>
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
                <li class="nav-item"><a href='<c:url value="/clientes/edita?id=${cliente.id}"/>' class="nav-link">Edita</a></li>
                <li class="nav-item"><a href='<c:url value="/clientes"/>' class="nav-link">Volver</a></li>
                </ul>
            </nav>   
            <section class="col-md-9">
                <div class="panel panel-default">
                    <h2 class="panel-heading">Datos Cliente</h2>
                    <ul class="panel-body list-group">
                        <li class="list-group-item"><strong>ID:</strong>
                            <span class="list-group-item-text">${cliente.id}</span></li>
                        <li class="list-group-item"><strong>Nombre:</strong> ${cliente.nombre}</li>
                        <li class="list-group-item"><strong>DNI:</strong>${cliente.dni}</li>
                        <li class="list-group-item"><strong>Socio:</strong> ${cliente.socio?"Sí":"No"}</li>
                        <li class="list-group-item"><strong>Medio Pago:</strong> ${mediosPago[cliente.medioPago]}</li>
                        <li class="list-group-item"><strong>Fecha Nacimiento:</strong>
                            <club:localDate value="${cliente.fechaNacimiento}" pattern="dd 'de' MMMM 'de' yyyy"/>
                        </li>
                    </ul>
                </div>
            </section>
            </main>
    <club:pie-pagina/>
</body>
</html>

