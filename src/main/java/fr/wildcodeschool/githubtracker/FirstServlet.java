package fr.wildcodeschool.githubtracker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FirstServlet", urlPatterns = "/other")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<String> githubPeople = new ArrayList<String>();
            githubPeople.add("Bobby");
            githubPeople.add("Mark");
            githubPeople.add("Thierry");
            githubPeople.add("Johny");
            githubPeople.add("Igor");

        request.setAttribute("liste",githubPeople);
        this.getServletContext().getRequestDispatcher("/githubers.jsp").forward(request,response);
    }
}
