/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.PrimerDesarrolloWeb.ServerltController;

import Modelo.PrimerDesarrolloWeb.JavaBeans.DatosEncuesta.DatosEncuesta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author etovar
 */
@WebServlet(name = "ServerltController", urlPatterns = {"/ServerltController"})
public class ServerltController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /**
         * Se crea una instacia del clase DatosEncuesta y esta se llamara datosEncuesta
         */
        DatosEncuesta datosEncuesta  = new DatosEncuesta(); 
        /**
         * Se realiza el request.getParameter el cual traera los datos de
         * name = "nombreCompleto" que se encuentran dentro de index.jsp, lego este
         * los enviea con el setNombreCompleto a la clase DatosEncuesta.java
         * alli esto quedaran almacenados
         */
        datosEncuesta.setNombreCompleto(request.getParameter("nombreCompleto"));
        /**
         * Se realiza el request.getParameterValues el cual traera los datos de
         * values = "proLeng" quue se encuentran dentro de index.jsp, lego este
         * los enviea con el setProLeng a la clase DatosEncuesta.java
         * alli esto quedaran almacenados
         */
        datosEncuesta.setProLeng(request.getParameterValues("proLeng"));
        /**
         * Este almacena todos los datos obtenidos en las request anteriores
         */
        request.setAttribute("datosEncuesta", datosEncuesta);
        /**
         * Envia los datos a salida.jsp
         */
        request.getRequestDispatcher("salida.jsp").forward(request, response);      
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
