package com.venvo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author venvo
 * @date 2021-03-04 11:19
 * @description
 * @modified By
 * @version: jdk1.8
 */
@Slf4j
@WebServlet("/hello")
public class HelloServelt extends HttpServlet {

//    Logger log = LoggerFactory.getLogger(HelloServelt.class);


    @Override
    public void init() {
        System.out.println("初始化Servlet....");

    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("入口");
        doGet(req, res);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "my simple framework!!";
        log.debug("name is" + name);
        req.setAttribute("name", name);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {

        System.out.println("destroy....");

    }
}
