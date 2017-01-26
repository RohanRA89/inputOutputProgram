package com.ironyard.web;

import com.ironyard.data.gSonClass;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.ObjectInput;

/**
 * Created by rohanayub on 1/23/17.
 */
@WebServlet(name = "sessionServlet", urlPatterns="/storeAsSession")
public class sessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        int personAge = Integer.parseInt(request.getParameter("personAge"));
        String personCity = request.getParameter("personCity");
        String personCountry = request.getParameter("personCountry");

        gSonClass personObj = new gSonClass(firstName, lastName, personAge, personCity,personCountry);
        personObj.saveToTemp();
        request.getSession().setAttribute("person",personObj);

        String nextJSP = "/storedInfo.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
