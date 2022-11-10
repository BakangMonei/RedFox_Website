package com.neiza.RedFox.Controller;

import com.neiza.RedFox.Model.DAO.SubscriberDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "pOSAction", value = "/pOSAction")
public class POSAction extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException , SQLException {

        }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(POSAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String prole = request.getParameter("role");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String city = request.getParameter("city");
        try {
            SubscriberDAO.signUpSubscriber(prole, username, password, city);
            getServletContext().getRequestDispatcher("/index.html").forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>
}