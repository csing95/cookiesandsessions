import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCentral")
public class ServletCentral extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String nextUrl = null;
        String username;
        String password;

        String act = request.getParameter("hiddena");
        if (act.equals("start")){

            username = request.getParameter("username");
            password = request.getParameter("password");

            User myUser = new User(username,password);

            Cookie aCookie = new Cookie("dude",myUser.toString());
            aCookie.setMaxAge(60*60*24); //this makes the cookie live for 24 hours
            response.addCookie(aCookie);
            nextUrl = "/result.jsp";
        } //end of action start

        getServletContext().getRequestDispatcher(nextUrl).forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
