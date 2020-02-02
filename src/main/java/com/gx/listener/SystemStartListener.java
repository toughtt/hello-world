package com.gx.listener;

import jdk.nashorn.internal.ir.RuntimeNode;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author wall
 * @data 20 - 18:46
 */
public class SystemStartListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext application = sce.getServletContext();
        String contextPath = application.getContextPath();
        application.setAttribute("APP_PATH", contextPath);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
