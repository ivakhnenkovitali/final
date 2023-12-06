package by.IT.controllers.user;

import by.IT.model.serviсes.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.IT.constants.JspConstants.MESSAGE_ATTR;

@WebServlet(name = "abstractController")
public abstract class AbstractController extends HttpServlet {
    protected UserService userService;

    @Override
    public void init() throws ServletException {
        userService = UserService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    public void forward(HttpServletRequest req, HttpServletResponse resp,
                        String url) throws ServletException, IOException {
        req.getRequestDispatcher(url).forward(req, resp);
    }

    public void forward(HttpServletRequest req, HttpServletResponse resp,
                        String url, String message) throws ServletException, IOException {
        req.setAttribute(MESSAGE_ATTR, message);
        forward(req, resp, url);
    }

    public void redirect(HttpServletResponse resp, String url) throws IOException {
        resp.sendRedirect(getServletContext().getContextPath() + url);
    }

}

