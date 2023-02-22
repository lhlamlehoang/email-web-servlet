package org.example.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet(name="EmailWebServlet", urlPatterns = {"/emailList"})
public class EmailWebServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = "/index.jsp";

        String action = req.getParameter("action");
        if (action == null) {
            action = "join";
        }
        if (action.equals("join")) {
            url = "/index.jsp";
        } else if (action.equals("add")) {
            //get parameters
            url = "/thanks.jsp";
            String email = req.getParameter("email");
            String firstname = req.getParameter("firstname");
            String lastname = req.getParameter("lastname");

            //store data
            User user = new User(email, firstname, lastname);
            UserDB db = new UserDB();
            db.insert(user);

            req.setAttribute("user", user);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
