package com.venvo.controller;

import com.venvo.controller.frontend.MainPageController;
import com.venvo.controller.superadmin.HeadLineOperationController;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Retention;

/**
 * @author venvo
 * @date 2021-03-05 16:04
 * @description
 * @modified By
 * @version: jdk1.8
 */
@WebServlet("/")
public class DispatchServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("request path is:" + req.getServletPath());
        System.out.println("request mthod is:" + req.getMethod());

        if (req.getServletPath() == "/frontend/getmainpageinfo" && req.getMethod() == "GET") {
            new MainPageController().getMainPageInfo(req, resp);

        } else if (req.getServletPath() == "superadmin/addheadline" && req.getMethod() == "POST") {
            new HeadLineOperationController().addHeadLine(req, resp);
        }

    }
}
