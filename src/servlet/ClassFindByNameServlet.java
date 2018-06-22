package servlet;

import entity.Course;
import service.CourseService;
import service.Impl.CourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class ClassFindByNameServlet extends HttpServlet {

   private CourseService courseService = new CourseServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String find = req.getParameter("find");
        List <Course> byName = courseService.findByName(find);
        req.setAttribute("courseServiceAll",byName);
        req.getRequestDispatcher("classFindAllServlet.jsp").forward(req,resp);
    }
}
