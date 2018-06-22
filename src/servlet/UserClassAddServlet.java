package servlet;

import service.Impl.UserClassServiceImpl;
import service.UserClassService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;


public class UserClassAddServlet extends HttpServlet {
    private UserClassService userClassService = new UserClassServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = UUID.randomUUID().toString();
        String username = req.getParameter("username");
        String name = req.getParameter("name");
        String teacher = req.getParameter("teacher");
        String number = req.getParameter("number");
        userClassService.userClassAdd(id, username, name, teacher, number);
        req.setAttribute("username", username);
        req.getRequestDispatcher("/UserClassFindAllServlet").forward(req, resp);
    }
}
