package com.ironyard.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by rohanayub on 1/23/17.
 */
@WebServlet(name = "sessionServlet", urlPatterns="/storeAsSession")
public class sessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        request.getSession().setAttribute("firName", firstName);

        String lastName = request.getParameter("lastName");
        request.getSession().setAttribute("lasName", lastName);

        int personAge = Integer.parseInt(request.getParameter("personAge"));
        request.getSession().setAttribute("ageVal",personAge);

        String personCity = request.getParameter("personCity");
        request.getSession().setAttribute("cityName",personCity);

        String personCountry = request.getParameter("personCountry");
        request.getSession().setAttribute("countryName",personCountry);

        String nextJSP = "/storedInfo.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
