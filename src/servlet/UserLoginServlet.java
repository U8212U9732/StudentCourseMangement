package servlet;

import entity.User;
import service.Impl.UserServiceImpl;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UserLoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = userService.findAll(username, password);
        if (user!=null) {
            req.setAttribute("user",username);
            req.getRequestDispatcher("/ClassFindAllServelt").forward(req,resp);
        }else {
            req.setAttribute("error","账户或密码错误请从新填写");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}
