package by.IT.controllers.user;


import by.IT.constants.ApplicationConstants;
import by.IT.controllers.user.AbstractController;
import by.IT.model.entities.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.IT.constants.JspConstants.*;

@WebServlet(urlPatterns = ApplicationConstants.REGISTRATION_CONTROLLER)
public class RegistrationController extends AbstractController{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login =req.getParameter(LOGIN_PARAM);
        String name =req.getParameter(PASS_PARAM);
        String password =req.getParameter(LOGIN_PARAM);
        String email =req.getParameter(EMAIL_PARAM);
        User user = new User(login, name, email);
        if (userService.addUser(user,password)){
            redirect(resp,LOGIN_JSP);
        }else {

        }

    }
}
1915