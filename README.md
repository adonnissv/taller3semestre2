# taller3semestre2
Taller individual Adonis Subiabre
# Descripción de principales clases del dominio del problema y principales funcionalidades->
Como se podía ver en la evidencia1, entre las clases principales encontramos RegistroArtistaServlet, RegistroAsistenteServlet y RegistroEventosServlet, estas tres clases cumplen la función de registrar a los artistas,
asistentes y eventos, estas clases están dentro del package controller, luego tenemos el package model, dentro de él están las clases Artista, Asistente y EventoMusical, estas clases contienen los atributos de cada una.
Dentro del package model, tenemos el package data, en el están las clases DBConnector y DBGenerator, cumplen las funciones de crear y conectar la base de datos para que se logre guardar la información. Y dentro del package 
data está el package dao, dentro de él están las clases ArtistaDAO, Asistente DAO Y EventoDAO, cumplen la función de recepcionar el tipo de información que corresponde cada uno.
# Descripción de datos a gestionar mediante la base de datos->
Las entidades principales son Asistente, Artista y Evento, la base de datos gestionará todos estos datos. Dentro de Asistente, su clave primaria (validador) será su información de contacto, para Artista, su clave primaria 
será su nombre artístico, y para Evento, será nombre evento.

# No hice mucho uso de GPT, solo le pedí esto:
dame 3 .jsp (incluye también el styles.css), estos se llaman:
registroArtista.jsp (contiene espacios para ingresar el nombre del artista y su genero musical)
registroEvento.jsp (contiene espacios para ingresar el nombreEvento, fecha, lugar y artistas)
registroAsistente.jsp (contiene espacios para numEntradas, informacionContacto y preferenciaMusical)
