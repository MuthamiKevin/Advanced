import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PasswordValidationServlet")
public class PasswordValidationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get password entered by the user
        String password = request.getParameter("password");

        // Check if password is correct
        if (password.equals("servlet")) {
            // Forward the request to WelcomeServlet if password is correct
            request.getRequestDispatcher("/WelcomeServlet").forward(request, response);
        } else {
            // Show error message if password is incorrect
            response.getWriter().println("Sorry, username or password error");
        }
    }
}
