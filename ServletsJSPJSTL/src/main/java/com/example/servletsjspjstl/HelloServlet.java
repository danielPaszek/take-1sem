package com.example.servletsjspjstl;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = {"/hello-servlet"})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf8");
        request.setCharacterEncoding("utf8");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        out.println("<html>");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");

        out.println("<p>Witaj, " + name + ", masz " + age + " lat</p>");

        out.println("</body>");
        out.println("</html>");
        out.close();

    }

    public void destroy() {
    }
}