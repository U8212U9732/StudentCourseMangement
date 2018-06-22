package servlet;


import service.CourseService;
import service.Impl.CourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;


public class ClassAddServlet extends HttpServlet {
    private CourseService courseService = new CourseServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = UUID.randomUUID().toString();
        String name = req.getParameter("name");
        String teacher = req.getParameter("teacher");
        String number = req.getParameter("number");
        courseService.classAdd(id, name, teacher, number);
        /*req.getRequestDispatcher("/ClassFindAllServelt").forward(req, resp);*/
        resp.sendRedirect("/ClassFindAllServelt");
    }
}
