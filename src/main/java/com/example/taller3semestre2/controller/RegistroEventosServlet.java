package com.example.taller3semestre2.controller;

import com.example.taller3semestre2.model.Artista;
import com.example.taller3semestre2.model.EventoMusical;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "registroEvento",value = "/registrarEvento")
public class RegistroEventosServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("a");
        String nombreEvento=request.getParameter("nombreEvento").toString();
        String fecha= request.getParameter("fecha").toString();
        String lugar= request.getParameter("lugar").toString();
        List<Artista> artistas= (List<Artista>) request.getAttribute("artistas");

        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/registroEvento.jsp");
        if(!fecha.isEmpty() && !nombreEvento.isEmpty() && !lugar.isEmpty() && !artistas.isEmpty()){
            EventoMusical eventoMusical=new EventoMusical(nombreEvento,fecha,lugar,artistas);
            if(eventoMusical.agregarEventoMusical()){
                request.setAttribute("status","Se ha registrado correctamente");
            }else{
                request.setAttribute("status","Evento ya registrado!");
            }

        }else{
            request.setAttribute("status","Rellene los campos!");
        }

    }
}
