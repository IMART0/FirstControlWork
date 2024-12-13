package ru.itis.oris.controlwork.listenner;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import ru.itis.oris.controlwork.repository.DbWork;


@WebListener
public class ContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        DbWork.getInstance();
    }

    public void contextDestroyed(ServletContextEvent sce) {
        DbWork.getInstance().destroy();
    }
}