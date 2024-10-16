package org.example.teste;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet(name = "cadastrar_adm", value = "/cadastrar_adm")

public class CadastrarADM extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String dt_nasc = request.getParameter("dt_nasc");
        String email = request.getParameter("email");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();


    }

}
