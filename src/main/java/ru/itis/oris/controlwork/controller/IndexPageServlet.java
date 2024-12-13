package ru.itis.oris.controlwork.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.itis.oris.controlwork.service.ScheduleService;

import java.io.IOException;

@WebServlet("")
public class IndexPageServlet extends HttpServlet {

    private ScheduleService service = new ScheduleService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

        try {
            request.setAttribute("schedules", service.getAll());
            request.getRequestDispatcher("/index.ftl").forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}
