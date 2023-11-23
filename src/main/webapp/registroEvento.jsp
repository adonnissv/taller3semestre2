<%--
  Created by IntelliJ IDEA.
  User: adoni
  Date: 23-11-2023
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro Evento</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<main>
    <article>
        <section class="formulario">
            <%
                String mensaje = (String) request.getAttribute("status");
                if (mensaje != null && !mensaje.isEmpty()) {
            %>
            <h2><%= mensaje %></h2>
            <%
                }
            %>
            <form action="/registrarEvento" method="post">
                <input name="nombreEvento" placeholder="Nombre Evento" type="text" required>
                <input name="fecha" placeholder="Fecha" type="text" required>
                <input name="lugar" placeholder="Lugar" type="text" required>
                <input name="artistas" placeholder="Artistas" type="text" required>
                <button type="submit">Agregar</button>
            </form>
            <a href="index.jsp">Volver</a>

        </section>
    </article>
</main>
</body>
</html>
