package servlet;

import entity.UserClass;
import service.Impl.UserClassServiceImpl;
import service.UserClassService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class UserClassFindAllServlet extends HttpServlet {
    private UserClassService userClassService = new UserClassServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        List <UserClass> userClasses = userClassService.userClassFindAll(username);
        req.setAttribute("courseServiceAll", userClasses);
        req.getRequestDispatcher("userClassFindAll.jsp").forward(req, resp);
    }
}
