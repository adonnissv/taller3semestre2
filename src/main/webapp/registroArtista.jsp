<%--
  Created by IntelliJ IDEA.
  User: adoni
  Date: 23-11-2023
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro Artista</title>
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
            <form action="/registrarArtista" method="post">
                <input name="nombreArtistico" placeholder="Nombre Artistico" type="text" required>
                <input name="generoMusical" placeholder="GeneroMusical" type="text" required>
                <button type="submit">Agregar</button>
            </form>
            <a href="index.jsp">Volver</a>

        </section>
    </article>
</main>
</body>
</html>
