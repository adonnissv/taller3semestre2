package com.example.taller3semestre2.controller;

import com.example.taller3semestre2.model.Asistente;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "registroAsistente",value = "/registrarAsistente")
public class RegistroAsistenteServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("a");
        String numEntradas=request.getParameter("numEntradas").toString();
        String numContacto= request.getParameter("numContacto").toString();
        String preferenciaMusical= request.getParameter("preferenciaMusical").toString();
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/registroAsistente.jsp");
        if(!numContacto.isEmpty() && !numEntradas.isEmpty() && !preferenciaMusical.isEmpty()){
            Asistente asistente=new Asistente(numEntradas,numContacto,preferenciaMusical);
            if(asistente.agregarAsistente()){
                request.setAttribute("status","Se ha registrado correctamente");
            }else{
                request.setAttribute("status","Asistente ya registrado!");
            }

        }else{
            request.setAttribute("status","Rellene los campos!");
        }

    }
}
