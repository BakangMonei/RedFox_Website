package com.neiza.RedFox.Controller;

import com.neiza.RedFox.Model.Bean.AdminBean;
import com.neiza.RedFox.Model.Bean.POSBean;
import com.neiza.RedFox.Model.DAO.SubscriberDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet(name = "loginAction", value = "/loginAction")
public class LoginAction extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResultSet res = null;

        response.setContentType("text/html");

        String username = request.getParameter("userid");
        String password = request.getParameter("password");

        SubscriberDAO subscriberDAO = new SubscriberDAO();
        try {
            res = subscriberDAO.verifyAdmin(username, password);
            if(res.next()){
                //Only If Credentials == true
                System.out.println("Admin Exists");
                AdminBean adminBean = new AdminBean();
                adminBean.setRole(res.getString(3));
                System.out.println(adminBean.getRole());
                response.sendRedirect(request.getContextPath() + "/adminPage.jsp");
            }
            else {
                System.out.println("Incorrect Login");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

