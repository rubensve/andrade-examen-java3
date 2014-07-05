/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ruben.controller;

import com.ruben.model.Evaluacion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T107
 */
public class ServletExamen extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Evaluacion e1;
        e1 = new Evaluacion("Ana", (float) 7.0);
        request.setAttribute("resultados", e1);
        RequestDispatcher despachador= request.getRequestDispatcher("/presentacion.jsp");
        despachador.forward(request, response);
}
}