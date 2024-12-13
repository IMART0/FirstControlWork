package ru.itis.oris.controlwork.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.itis.oris.controlwork.model.Schedule;
import ru.itis.oris.controlwork.service.ScheduleService;

import java.io.IOException;

@WebServlet("/detail")
public class DetailPageServlet extends HttpServlet {

    private final ScheduleService service = new ScheduleService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        Long id = Long.parseLong(req.getParameter("id"));
        Schedule schedule = service.findById(id);
        req.setAttribute("schedule", schedule);
        try {
            req.getRequestDispatcher("detail.ftl").forward(req, resp);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }


    }
}
