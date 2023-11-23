package com.example.taller3semestre2.controller;

import com.example.taller3semestre2.model.Artista;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "registroArtista",value = "/registrarArtista")
public class RegistroArtistaServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("a");
        String nombreArtistico=request.getParameter("nombreArtistico").toString();
        String generoMusical= request.getParameter("generoMusical").toString();
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/registroArtista.jsp");
        if(!generoMusical.isEmpty() && !nombreArtistico.isEmpty()){
            Artista artista=new Artista(nombreArtistico,generoMusical);
            if(artista.agregarArtista()){
                request.setAttribute("status","Se ha registrado correctamente");
            }else{
                request.setAttribute("status","Nombre ya registrado!");
            }

        }else{
            request.setAttribute("status","Rellene los campos!");
        }

    }
}
