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
    <title>Registro Asistente</title>
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
            <form action="/registrarAsistente" method="post">
                <input name="numEntradas" placeholder="Numero Entradas" type="text" required>
                <input name="numContacto" placeholder="Numero Contacto" type="text" required>
                <input name="preferenciaMusical" placeholder="Preferencia Musical" type="text" required>
                <button type="submit">Agregar</button>
            </form>
            <a href="index.jsp">Volver</a>

        </section>
    </article>
</main>
</body>
</html>
